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
package org.ow2.aspirerfid.patrolman.ui;

import javax.microedition.lcdui.Choice;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.List;

import org.ow2.aspirerfid.nfc.midlet.generic.GenericMidlet;
import org.ow2.aspirerfid.nfc.midlet.generic.ui.Screen;
import org.ow2.aspirerfid.patrolman.Patrolman;

/**
 * The main menu screen
 * 
 * @author Thomas Calmant
 */
public class MenuScreen extends Screen {

	/** Select command reportName */
	private static final String m_selectName = "Select";

	/** Select command */
	private static final Command m_selectCmd = new Command(m_selectName,
			Command.ITEM, 1);

	/** Name of the exit option. */
	private static final String m_exitName = "Exit";

	/** Exit command. */
	private static final Command m_exitCmd = new Command(m_exitName,
			Command.EXIT, 1);

	/** Retrieve an ECSpec file from a server */
	private static final String m_connectName = "Retrieve ECSpec";

	/** Listen for tags */
	private static final String m_startTagsListeningName = "Wait for tags";

	/** Stop listening for tags */
	private static final String m_stopTagsListeningName = "Stop waiting for tags";

	/** Submit questionnaires to server */
	private static final String m_submitAll = "Submit questionnaires to server";

	/** Disconnect from server */
	private static final String m_disconnectServer = "Disconnect from server";

	/** Tag listening state */
	private boolean m_tagListening;

	/** Options UI list */
	private List m_optionsList;

	/** Options names */
	private final String[] m_optionsNames = { m_connectName,
			m_startTagsListeningName, m_submitAll, m_disconnectServer,
			m_exitName };

	/**
	 * Creates the menu (options list), but doesn't activate it
	 * 
	 * @param midlet
	 *            Parent MIDlet
	 */
	public MenuScreen(GenericMidlet midlet) {
		super(midlet);
		m_tagListening = false;

		m_optionsList = new List("Main menu", Choice.IMPLICIT, m_optionsNames,
				null);

		// Select command
		m_optionsList.setSelectCommand(m_selectCmd);

		// Exit command
		m_optionsList.addCommand(m_exitCmd);

		// Listener
		m_optionsList.setCommandListener(this);

		setDiplayable(m_optionsList);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.microedition.lcdui.CommandListener#commandAction(javax.microedition
	 * .lcdui.Command, javax.microedition.lcdui.Displayable)
	 */
	public void commandAction(Command command, Displayable displayable) {
		if (displayable != m_optionsList)
			throw new RuntimeException("Invalid 'main menu' displayable");

		// Exit command
		if (command == m_exitCmd) {
			getMidlet().stopApplication(true, true);
		} else if (command == m_selectCmd) {
			String option = m_optionsNames[m_optionsList.getSelectedIndex()];

			// Exit menu command
			if (option.equals(m_exitName)) {
				getMidlet().stopApplication(true, true);
			}
			// Connect menu command
			else if (option.equals(m_connectName)) {
				((Patrolman) getMidlet()).startBluetoothDetection(this);
			}
			// Toggle listening for tags
			else if (option.equals(m_startTagsListeningName)) {
				if (m_tagListening) {
					// Stop listening
					((Patrolman) getMidlet()).stopTagDetection();
					m_tagListening = false;
					m_optionsList.set(m_optionsList.getSelectedIndex(),
							m_startTagsListeningName, null);
				} else {
					// Start listening
					if (((Patrolman) getMidlet()).startTagDetection()) {
						m_tagListening = true;
						m_optionsList.set(m_optionsList.getSelectedIndex(),
								m_stopTagsListeningName, null);
					}
				}
			}
			// Submit all questionnaires
			else if (option.equals(m_submitAll)) {
				((Patrolman) getMidlet()).connectSubmitAllQuestionnaires();
			}
			// Disconnect from server
			else if(option.equals(m_disconnectServer)) {
				((Patrolman)getMidlet()).disconnectBluetooth();
			}
			// Unknown command
			else
				throw new RuntimeException("Invalid option : " + option);
		}

	}

}