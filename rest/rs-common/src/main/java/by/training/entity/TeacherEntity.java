package by.training.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "teacher")
@XmlAccessorType(XmlAccessType.FIELD)
public class TeacherEntity implements Serializable {

    private static final long       serialVersionUID = -4675933459216781523L;

    @XmlElement(required = true)
    private long                    id;

    @XmlElement(required = true)
    private String                  name;

    @XmlElement(required = true)
    private Date                    birthday;

    private Map<Long, LessonEntity> lessons;

    public TeacherEntity() {
    }

    public TeacherEntity(final long id, final String name, final Date birthday,
            final Map<Long, LessonEntity> lessons) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.lessons = lessons;
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(final Date birthday) {
        this.birthday = birthday;
    }

    public Map<Long, LessonEntity> getLessons() {
        return lessons;
    }

    public void setLessons(final Map<Long, LessonEntity> lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[id:" + id + ",name:" + name + ",birthday:" + birthday + "]";
    }

}
