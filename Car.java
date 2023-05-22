public class Car extends ATransports {
    
    private String model;
    private String id;

    public Car (String model, String id) {
        setModel(model,id);
    }
    
    public String getModel() {
        return model;
    }

    public void setModel(String model, String id) {
        if (model.equals("BMW") || model.equals("Mercedes") || model.equals("Fiat"))
        this.model = model;
        this.id    = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void print() {

        System.out.println(toString());
    }

    public String toString() {

        String out = model +" " + id;

        return out;
    }

}
