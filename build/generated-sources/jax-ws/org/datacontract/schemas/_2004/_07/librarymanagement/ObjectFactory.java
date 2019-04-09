
package org.datacontract.schemas._2004._07.librarymanagement;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.librarymanagement package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfBook_QNAME = new QName("http://schemas.datacontract.org/2004/07/LibraryManagement", "ArrayOfBook");
    private final static QName _Book_QNAME = new QName("http://schemas.datacontract.org/2004/07/LibraryManagement", "Book");
    private final static QName _BookBookName_QNAME = new QName("http://schemas.datacontract.org/2004/07/LibraryManagement", "BookName");
    private final static QName _BookBookGenre_QNAME = new QName("http://schemas.datacontract.org/2004/07/LibraryManagement", "BookGenre");
    private final static QName _BookBookAuthor_QNAME = new QName("http://schemas.datacontract.org/2004/07/LibraryManagement", "BookAuthor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.librarymanagement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfBook }
     * 
     */
    public ArrayOfBook createArrayOfBook() {
        return new ArrayOfBook();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/LibraryManagement", name = "ArrayOfBook")
    public JAXBElement<ArrayOfBook> createArrayOfBook(ArrayOfBook value) {
        return new JAXBElement<ArrayOfBook>(_ArrayOfBook_QNAME, ArrayOfBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Book }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/LibraryManagement", name = "Book")
    public JAXBElement<Book> createBook(Book value) {
        return new JAXBElement<Book>(_Book_QNAME, Book.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/LibraryManagement", name = "BookName", scope = Book.class)
    public JAXBElement<String> createBookBookName(String value) {
        return new JAXBElement<String>(_BookBookName_QNAME, String.class, Book.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/LibraryManagement", name = "BookGenre", scope = Book.class)
    public JAXBElement<String> createBookBookGenre(String value) {
        return new JAXBElement<String>(_BookBookGenre_QNAME, String.class, Book.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/LibraryManagement", name = "BookAuthor", scope = Book.class)
    public JAXBElement<String> createBookBookAuthor(String value) {
        return new JAXBElement<String>(_BookBookAuthor_QNAME, String.class, Book.class, value);
    }

}
