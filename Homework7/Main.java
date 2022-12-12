package Homework7;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");
        NoteOperation noteOperation = new NoteOperationImpl();
        NoteMapper noteMapper = new NoteMapper();
        FileOperation fileOperation = new FileOperationImpl(
                "/Users/dmtishchenko/Desktop/GB_1/OOP_java/Homework7/notes.txt", noteMapper);
        Operate operate = new Operate(fileOperation, noteOperation);
        NoteCreator noteCreator = new NoteCreator();
        View view = new View(noteCreator, operate);
        view.run();

    }
}