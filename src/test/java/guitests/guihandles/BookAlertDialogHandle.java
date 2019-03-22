package guitests.guihandles;

import javafx.scene.control.DialogPane;
import javafx.stage.Stage;
import seedu.address.ui.BookUiManager;

/**
 * A handle for the {@code AlertDialog} of the UI.
 */
public class BookAlertDialogHandle extends StageHandle {
    private final DialogPane dialogPane;

    public BookAlertDialogHandle(Stage stage) {
        super(stage);

        dialogPane = getChildNode("#" + BookUiManager.ALERT_DIALOG_PANE_FIELD_ID);
    }

    /**
     * Returns the text of the header in the {@code AlertDialog}.
     */
    public String getHeaderText() {
        return dialogPane.getHeaderText();
    }

    /**
     * Returns the text of the content in the {@code AlertDialog}.
     */
    public String getContentText() {
        return dialogPane.getContentText();
    }
}