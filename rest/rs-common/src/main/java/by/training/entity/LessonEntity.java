package by.training.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "lesson")
@XmlAccessorType(XmlAccessType.FIELD)
public class LessonEntity implements Serializable {

    private static final long serialVersionUID = -7869184849008620292L;

    @XmlElement(required = true)
    private long              id;

    @XmlElement(required = true)
    private String            name;

    @XmlElement(required = true)
    private int               duration;

    public LessonEntity() {
    }

    public LessonEntity(final long id, final String name, final int duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(final int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[id:" + id + ",name:" + name + ",duration:" + duration + "]";
    }

}
