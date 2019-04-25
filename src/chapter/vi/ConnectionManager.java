package chapter.vi;

public class ConnectionManager {
    static Connection[] connectionsArr = new Connection[4];
    static Connection getConnection(){
        if (connectionsArr.length == 0){
            return null;
        } else {
            return connectionsArr[connectionsArr.length -1];
        }
    }
    private void addConnection(){
        Connection con = Connection.setupConnection("1.3","3.56");
        for (int i = 0; i < connectionsArr.length - 1 ; i++) {
            connectionsArr[i] = connectionsArr[i+1];
        }
        connectionsArr[connectionsArr.length-1] = con;
    }

}
class Connection {
    public String originalIP;
    public String destinnatioIP;
    private Connection(String oIp,String dIp){
        originalIP = oIp;
        destinnatioIP =dIp;
    }
    public static Connection setupConnection(String str1,String str2){
        return new Connection(str1,str2);
    }
}
