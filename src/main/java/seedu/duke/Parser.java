package seedu.duke;

import seedu.duke.command.AddCommand;
import seedu.duke.command.Command;
import seedu.duke.command.ExitCommand;
import seedu.duke.command.FindCommand;
import seedu.duke.command.GreetCommand;
import seedu.duke.command.HelpCommand;
import seedu.duke.command.InvalidCommand;
import seedu.duke.command.MarkCommand;
import seedu.duke.command.RemoveCommand;
import seedu.duke.command.RemoveExerciseCommand;
import seedu.duke.command.SetCommand;
import seedu.duke.command.ViewCommand;

import java.util.logging.Level;
import java.util.logging.Logger;

;

public class Parser {

    private static Logger logger = Logger.getLogger("Parser");

    public static Command parse(String input) {
        String userCommand = input.split(" ")[0];
        logger.log(Level.FINE, "command: " + userCommand);
        String arguments = input.substring(userCommand.length()).trim();
        logger.log(Level.FINE, "arguments:" + arguments);
        switch (userCommand) {
        case "greet":
            return new GreetCommand();
        case "exit":
            return new ExitCommand();
        case "set":
            return new SetCommand(arguments, true);
        case "add":
            return new AddCommand(arguments, true);
        case "view":
            return new ViewCommand(arguments);
        case "mark":
            return new MarkCommand(arguments);
        case "remove":
            return new RemoveCommand(arguments);
        case "find":
            return new FindCommand(arguments);
        case "help":
            return new HelpCommand();
        case "e_remove":
            return new RemoveExerciseCommand(arguments);
        default:
            return new InvalidCommand();
        }
    }

    public static String[] getArgumentList(String arguments) {
        assert (arguments != null);
        String[] argumentList = arguments.split("\\s*/\\s*");
        return argumentList;
    }

    public static String getAddType(String[] argumentList) {
        return argumentList[0];
    }
}
