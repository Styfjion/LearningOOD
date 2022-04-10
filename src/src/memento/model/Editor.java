package memento.model;

import java.util.ArrayList;
import java.util.List;

public class Editor {
    private final Doc doc;
    private final List<History> historyRecords;
    private int historyPosition = -1;

    public Editor(Doc doc) {
        System.out.println("<<<打开文档" + doc.getTitle());
        this.doc = doc;
        historyRecords = new ArrayList<>();
        backup();
        show();
    }

    public void append(String txt) {
        System.out.println("<<<插入操作");
        doc.setBody(doc.getBody() + txt);
        backup();
        show();
    }

    public void save() {
        System.out.println("<<<存盘操作");
    }

    public void delete() {
        System.out.println("<<<删除操作");
        doc.setBody("");
        backup();
        show();
    }

    private void backup() {
        historyRecords.add(doc.createHistory());
        historyPosition++;
    }

    private void show() {
        System.out.println(doc.getBody());
        System.out.println("<<<文档结束");
    }

    public void undo() {
        System.out.println("<<<撤销操作");
        if (historyPosition == 0) {
            return;
        }
        historyPosition--;
        History history = historyRecords.get(historyPosition);
        doc.restoreHistory(history);
        show();
    }

    public void redo() {
        System.out.println("<<<回退撤销操作");
        if (historyPosition >= historyRecords.size()) {
            return;
        }
        historyPosition++;
        History history = historyRecords.get(historyPosition);
        doc.restoreHistory(history);
        show();
    }
}
