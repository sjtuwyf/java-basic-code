package hanshusijiekou.fangfayinyong;

public class Book {
    private String name;
    private String publishingCompany;

    public Book(String name, String publishingCompany) {
        this.name = name;
        this.publishingCompany = publishingCompany;
    }

    private String bookMsg(String bookName) {
        return "《"+bookName+"》";
    }

    private String publishingMsg(String msg) {
        return msg;
    }

    public String packSaleMsg(String msg, StringWrapper wrapper) {
        return wrapper.wrap(msg);
    }

    public void sale() {
        String s = packSaleMsg(name, this::bookMsg) + packSaleMsg(publishingCompany, this::publishingMsg);
        System.out.println(s);
    }
}
