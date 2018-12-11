package lesson17Homework.Task03Strategy;

public class Client {
    private String recordtype;
    private String massege;

    public Client(String recordtype, String massege) {
        if(recordtype.equals("Console") || recordtype.equals("File") || recordtype.equals("TimeFile")) {
            this.recordtype = recordtype;
        }else {
            System.out.println("Вы можете использовать тольк три вида записи сообщения: Console, File,TimeFile ");
        }
        this.massege = massege;
    }

    public String getRecordtype() {
        return recordtype;
    }

    public void setRecordtype(String recordtype) {
        this.recordtype = recordtype;
    }

    public String getMassege() {
        return massege;
    }

    public void setMassege(String massege) {
        this.massege = massege;
    }
}
