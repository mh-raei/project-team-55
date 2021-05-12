package view.gamephases;

import controller.gamephasescontrollers.EndPhaseController;
import model.cards.monsters.Scanner;
import model.cards.monsters.Texchanger;
import view.ViewInterface;

public class EndPhase extends Duel {
    private EndPhaseController endPhaseController;


    @Override
    protected void execute() {
        endPhaseController = gameController.getEndPhaseController();
        String response = processCommand("");
        ViewInterface.showResult(response);
        showPhase();
    }

    @Override
    protected String processCommand(String command) {
        String response = "";
        if (Duel.getGameController().getCurrentTurnPlayer().isAI()) response = "AI turn completed";
        Scanner.deActivateEffect();
        Texchanger.makeArrayEmpty();
        gameController.changePhase();
        return response;
    }

}
