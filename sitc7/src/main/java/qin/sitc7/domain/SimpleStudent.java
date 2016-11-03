package qin.sitc7.domain;

import qin.javaee7.core.hibernate.SuperEntity7;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Deprecated
@Entity
@Table(name = "qin_simpleStudent")
@SuppressWarnings("all")
public class SimpleStudent implements SuperEntity7<Integer>
{
    private Integer id;

    @Id
    @GeneratedValue
    @Override
    public Integer getId()
    {
        return id;
    }

    @Override
    public void setId(Integer id)
    {
        this.id = id;
    }
}