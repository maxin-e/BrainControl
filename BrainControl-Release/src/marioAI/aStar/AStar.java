/*******************************************************************************
 * Copyright (C) 2017 Cognitive Modeling Group, University of Tuebingen
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * You can contact us at:
 * University of Tuebingen
 * Department of Computer Science
 * Cognitive Modeling
 * Sand 14
 * 72076 T�bingen 
 * cm-sekretariat -at- inf.uni-tuebingen.de
 ******************************************************************************/
package marioAI.aStar;

import java.util.List;

public interface AStar<ACTION, STATE> {

	void stop();

	void setMaxTime(long aStarTimeWindow);

	void setMaxSteps(int aStarIterationWindow);

	public List<ACTION> findActionSequenceToGoal(STATE initialState, GoalTester goalTester, List<AStarNodeVisualizer> visualizers);
	
	public List<ACTION> bestActionSequenceFound();

	public STATE bestStateAfterSearch();
}
