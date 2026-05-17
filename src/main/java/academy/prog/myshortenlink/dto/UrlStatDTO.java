package academy.prog.myshortenlink.dto;

import java.util.Date;

public class UrlStatDTO extends UrlDTO {

    private Long id;

    private long count;
    private Date lastAccess;

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public Date getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
    }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}
}
