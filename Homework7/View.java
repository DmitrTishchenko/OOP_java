package Homework7;

import java.util.List;

public class View {
    NoteCreator noteCreator;
    Operate operate;

    public View(NoteCreator noteCreator, Operate operate) {
        this.noteCreator = noteCreator;
        this.operate = operate;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            String command = noteCreator.promptString("Введите команду: READ,CREATE,UPDATE,LIST,DELETE,EXIT \n");
            try {
                com = Commands.valueOf(command);
            } catch (IllegalArgumentException e) {
                System.out.println("Неопознанная команда");
            }
            if (com == Commands.EXIT)
                return;
            try {
                switch (com) {
                    case CREATE:
                        operate.addNote(noteCreator.promptString("Заголовок заметки: "),
                                noteCreator.promptString("Введите текст: "));
                        break;
                    case READ:
                        Integer findId = noteCreator.promptInteger("Введите id для поиска: ");
                        System.out.println(operate.readNote(findId));
                        break;
                    case LIST:
                        List<Note> notes = operate.readAllNotes();
                        for (Note note : notes) {
                            System.out.println(note);
                            System.out.println();
                        }
                        break;
                    case UPDATE:
                        Integer findIdforUpdate = noteCreator.promptInteger("Введите id для поиска: ");
                        String titleForUpdate = noteCreator.promptString("Заголовок заметки: ");
                        String textForUpdate = noteCreator.promptString("Введите текст: ");
                        operate.updateNote(findIdforUpdate, titleForUpdate, textForUpdate);

                        break;
                    case DELETE:
                        Integer findIdforDel = noteCreator.promptInteger("Введите id для поиска: ");
                        operate.deleteNote(findIdforDel);
                        break;
                    case EXIT:
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}