package seedu.duke.command;

import seedu.duke.Duke;
import seedu.duke.Parser;
import seedu.duke.ui.Ui;
import seedu.duke.exception.IllegalValueException;
import seedu.duke.records.RecordList;
import seedu.duke.records.biometrics.Biometrics;
import seedu.duke.records.exercise.ExerciseList;
import seedu.duke.records.food.FoodList;
import seedu.duke.storage.Storage;

public class ExitCommand extends Command {
    private final String arguments;
    private Ui ui;

    public ExitCommand(String arguments) {
        this.arguments = arguments;
    }

    @Override
    public void execute() throws IllegalValueException {
        if (Parser.getArgumentsCount(arguments) > 0) {
            throw new IllegalValueException("Invalid exit command");
        }
        ui.output("Farewell!");
        Duke.isProgramFinished = true;
    }

    @Override
    public void setData(Ui ui, Storage storage, Biometrics biometrics, ExerciseList exerciseList, FoodList foodList,
                        RecordList recordList) {
        this.ui = ui;
    }
}
