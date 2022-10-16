package seedu.duke.command;

import seedu.duke.biometrics.Biometrics;
import seedu.duke.Ui;
import seedu.duke.exercise.ExerciseList;
import seedu.duke.food.FoodList;
import seedu.duke.storage.Storage;

public class HelpCommand extends Command {

    private Ui ui;

    public HelpCommand() {
    }

    @Override
    public void execute() {
        ui.output("Help will always be given at Hogwarts to those who ask for it\n"
                + "Available commands:\n"
                + "help - to display the help message\n"
                + "exit - to exit the program\n"
                + "set biometrics /{age} /{gender} /height /{weight} /{fat percentage}\n"
                + "add exercise /{description} /{repetitions} /{calories}\n"
                + "add food /{description} /{calories}\n"
                + "add weight /{weight} /{fat percentage}\n"
                + "remove food /{food index}\n"
                + "mark {done/undone} /{exercise index}\n"
                + "e_remove exercise /{index}\n"
                + "view {biometrics/exercise/food}");
    }

    @Override
    public void setData(Ui ui, Storage storage, Biometrics biometrics, ExerciseList exerciseList, FoodList foodList) {
        this.ui = ui;
    }
}
