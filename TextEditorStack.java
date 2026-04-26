import java.util.Stack;

public class TextEditorStack {

    static Stack<String> undoStack = new Stack<>();
    static Stack<String> redoStack = new Stack<>();
    static String currentText = "";

    public static void tambahTeks(String teks) {
        undoStack.push(currentText);
        currentText += teks;
        redoStack.clear();
        System.out.println("Teks sekarang: " + currentText);
    }

    public static void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Tidak ada undo.");
            return;
        }
        redoStack.push(currentText);
        currentText = undoStack.pop();
        System.out.println("Undo: " + currentText);
    }

    public static void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Tidak ada redo.");
            return;
        }
        undoStack.push(currentText);
        currentText = redoStack.pop();
        System.out.println("Redo: " + currentText);
    }

    public static void tampilkan() {
        System.out.println("Teks saat ini: " + currentText);
    }
}