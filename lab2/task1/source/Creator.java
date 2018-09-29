import java.util.Date;

public class Creator {
    private String surname;

    public Creator(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    /** 
     *	Method to get task
     *  @return date of received task
     */
    public String getTask() {
        Date date = new Date();
        return date.toString();
    }

    /**
     *  Method to finish task
     *  @return date of finished task
     */
    public String doneTask() {
        Date date = new Date();
        return date.toString();
    }
}
