package designpattern.singleton;

public class Connection {


    /**
     * class {@link Connection} sebagai class snapshot untuk mempresentasikan singleton pattern
    @host untuk host database
     @username untuk username database yang akan di connection kan
     @password password yang di gunakan untuk authentication database
     */
    private String host;
    private String username;
    private String password;


    public Connection(String host, String username, String password) {
        this.host = host;
        this.username = username;
        this.password = password;
    }

    public Object sql(String sql){
        return new Object();
    }
}
