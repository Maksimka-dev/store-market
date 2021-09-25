import java.util.UUID;

public class Product {
    UUID id;
    private String title;
    private String description;

    public Product(UUID i, String t, String d) {
        id = i;
        title = t;
        description = d;
    }

    public Product() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
