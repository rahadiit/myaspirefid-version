/*
 *  Copyright (C) Aspire
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.ow2.aspirerfid.patrolman.questionnaire;

import javax.microedition.lcdui.ChoiceGroup;

/**
 * Choice list to be added to a {@link Questionnaire}. Can be a unique or
 * multiple choice(s) list
 * 
 * @author Thomas Calmant
 */
public class ChoiceQuestion extends ChoiceGroup implements Question {

	/** Unique choice */
	public static final int UNIQUE = ChoiceGroup.EXCLUSIVE;

	/** Multiple choices */
	public static final int MULTIPLE = ChoiceGroup.MULTIPLE;

	/** Question's id */
	private String m_id;

	/** Correct answer */
	private int[] m_correctAnswer;

	/** Choice type */
	private int m_type;

	/** Default checked value */
	private int m_defaultValue;

	/**
	 * Creates the choice list
	 * 
	 * @param id
	 *            Question ID
	 * @param label
	 *            Label associated to the list
	 * @param type
	 *            {@link #UNIQUE} or {@link #MULTIPLE}
	 * @param choices
	 *            All choices in a String array
	 * @param default_value
	 *            Default selected choice
	 * @param correctAnswers
	 *            An array containing valid choices indices (corresponding to
	 *            choices). Can be null.
	 */
	public ChoiceQuestion(String id, String label, int type, String[] choices,
			int default_value, int[] correctAnswers) {
		super(label, type);

		m_id = id;
		m_defaultValue = default_value;
		m_correctAnswer = correctAnswers;
		m_type = type;

		for (int i = 0; i < choices.length; i++)
			append(choices[i], null);

		clear();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ow2.aspirerfid.patrolman.questionnaire.Question#clear()
	 */
	public void clear() {
		if (m_defaultValue >= 0 && m_defaultValue < size()) {
			boolean[] checks = new boolean[size()];
			checks[m_defaultValue] = true;

			setSelectedFlags(checks);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ow2.aspirerfid.patrolman.questionnaire.Question#getData()
	 */
	public Object getData() {
		boolean[] selectionFlags = new boolean[size()];
		getSelectedFlags(selectionFlags);
		return selectionFlags;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ow2.aspirerfid.patrolman.Question#getId()
	 */
	public String getId() {
		return m_id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ow2.aspirerfid.patrolman.Question#isCorrect()
	 */
	public boolean isCorrect() {
		if (m_correctAnswer == null || m_correctAnswer.length == 0)
			return true;

		switch (m_type) {
		case UNIQUE:
			int answer = getSelectedIndex();
			for (int i = 0; i < m_correctAnswer.length; i++) {
				if (answer == m_correctAnswer[i])
					return true;
			}
			return false;

		case MULTIPLE:
			boolean[] selected = new boolean[size()];
			int nb_selected = getSelectedFlags(selected);
			int nb_tested = 0;

			// We already have tested if the correct answers list is empty
			if (nb_selected == 0)
				return false;

			for (int i = 0; i < selected.length && nb_tested < nb_selected; i++) {
				if (selected[i]) {
					// Tests if selected box is in the correct answers list
					boolean correct = false;
					for (int j = 0; j < m_correctAnswer.length; j++) {
						if (i == m_correctAnswer[j]) {
							correct = true;
							break;
						}
					}

					// If the selected has not been found, it's incorrect
					if (!correct)
						return false;

					nb_tested++;
				}
			}

			// At this point, all possibilities has been tested
			return true;
		}

		// We may never reach this point
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ow2.aspirerfid.patrolman.questionnaire.Question#setData(java.lang
	 * .Object)
	 */
	public void setData(Object value) {
		boolean[] selectionFlags = (boolean[]) value;
		setSelectedFlags(selectionFlags);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ow2.aspirerfid.patrolman.Question#toXML()
	 */
	public String toXML() {
		return toXML(getData());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ow2.aspirerfid.patrolman.questionnaire.Question#toXML(java.lang.Object
	 * )
	 */
	public String toXML(Object data) {
		boolean[] state = (boolean[]) data;

		StringBuffer result = new StringBuffer();
		result.append("<choiceList id=\"").append(m_id).append("\">\n");

		switch (m_type) {
		case UNIQUE:
			// Search for the first selected item
			int firstChecked = 0;
			while (firstChecked < state.length && !state[firstChecked])
				firstChecked++;

			if (firstChecked == state.length)
				firstChecked = 0;

			result.append("<choice>").append(getString(firstChecked))
					.append("</choice>\n");
			break;

		case MULTIPLE:
			for (int i = 0; i < state.length; i++) {
				if (state[i]) {
					result.append("<choice>").append(getString(i))
							.append("</choice>\n");
				}
			}
			break;
		}

		result.append("</choiceList>\n");
		return result.toString();
	}
}