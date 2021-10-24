public enum CommandsPlaylist {
    DeleteCommand, AddCommand, ChooseComand, ShowCommand;


    public static String toString(CommandsPlaylist Command) {
        if (Command.equals(DeleteCommand)) {
            return "Delete Command";
        } else if (Command.equals(AddCommand)) {
            return "Add Command";
        } else if (Command.equals(ChooseComand)) {
            return "Choose Command";
        } else if (Command.equals(ShowCommand)) {
            return "Show Command";
        }
        return "";
    }

}
