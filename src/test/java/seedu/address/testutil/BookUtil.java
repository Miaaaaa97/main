package seedu.address.testutil;

import static seedu.address.logic.parser.CliSyntax.PREFIX_AUTHOR;
import static seedu.address.logic.parser.CliSyntax.PREFIX_NAME;
import static seedu.address.logic.parser.CliSyntax.PREFIX_RATING;
import static seedu.address.logic.parser.CliSyntax.PREFIX_TAG;

import seedu.address.logic.commands.AddBookCommand;
import seedu.address.logic.commands.ListBookCommand;
import seedu.address.model.book.Book;

/**
 * A utility class for Book.
 */
public class BookUtil {

    /**
     * Returns an add command string for adding the {@code book}.
     */
    public static String getAddBookCommand(Book book) {
        return AddBookCommand.COMMAND_WORD + " " + getBookDetails(book);
    }

    /**
     * Returns the part of command string for the given {@code book}'s details.
     */
    public static String getBookDetails(Book book) {
        StringBuilder sb = new StringBuilder();
        sb.append(PREFIX_NAME + book.getBookName().fullName + " ");
        sb.append(PREFIX_AUTHOR + book.getAuthor().fullName + " ");
        sb.append(PREFIX_RATING + book.getRating().value + " ");
        book.getTags().stream().forEach(
            s -> sb.append(PREFIX_TAG + s.tagName + " ")
        );
        return sb.toString();
    }

    /**
     * Returns the part of command string for the listBookCommand for one book.
     */
    public static String getListBookCommand(Book book) {
        StringBuilder sb = new StringBuilder();
        sb.append(ListBookCommand.COMMAND_WORD + " ");
        sb.append(PREFIX_NAME + book.getBookName().fullName + " ");
        book.getTags().stream().forEach(
                s -> sb.append(PREFIX_TAG + s.tagName + " "));
        sb.append(PREFIX_RATING + book.getRating().value + " ");
        return sb.toString();
    }

    /**
     * Returns the part of command string for the given {@code EditBookDescriptor}'s details.
     */
    /*
    public static String getEditBookDescriptorDetails(EditBookDescriptor descriptor) {
        StringBuilder sb = new StringBuilder();
        descriptor.getName().ifPresent(name -> sb.append(PREFIX_NAME).append(name.fullName).append(" "));
        descriptor.getPhone().ifPresent(phone -> sb.append(PREFIX_PHONE).append(phone.value).append(" "));
        descriptor.getEmail().ifPresent(email -> sb.append(PREFIX_EMAIL).append(email.value).append(" "));
        descriptor.getAddress().ifPresent(address -> sb.append(PREFIX_ADDRESS).append(address.value).append(" "));
        if (descriptor.getTags().isPresent()) {
            Set<Tag> tags = descriptor.getTags().get();
            if (tags.isEmpty()) {
                sb.append(PREFIX_TAG);
            } else {
                tags.forEach(s -> sb.append(PREFIX_TAG).append(s.tagName).append(" "));
            }
        }
        return sb.toString();
    }
    */
}
