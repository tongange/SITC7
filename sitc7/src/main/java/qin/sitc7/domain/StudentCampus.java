/*
     using TreeSet must implements Comparable and Comparator interface
 */

package qin.sitc7.domain;

import qin.javaee7.core.hibernate.SuperEntity7;
import qin.sitc7.core.SitcPrint;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("all")
public class StudentCampus implements SuperEntity7<Long>,
          Comparator<StudentCampus>, Comparable<StudentCampus>
{
    //region constructor
    public StudentCampus()
    {
        SitcPrint.print7.prints("ini StudentCampus class");
    }

    public StudentCampus(String studentCampusName)
    {
        this.studentCampusName = studentCampusName;
    }
    //endregion

    //region id
    private Long id;

    @Override
    public Long getId()
    {
        return id;
    }

    @Override
    public void setId(Long id)
    {
        this.id = id;
    }
    //endregion

    //region StudentCampusName
    private String studentCampusName;

    public String getStudentCampusName()
    {
        return studentCampusName;
    }

    public void setStudentCampusName(String studentCampusName)
    {
        this.studentCampusName = studentCampusName;
    }
    //endregion

    //region toString

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("StudentCampus{");
        sb.append("id=").append(id);
        sb.append(", studentCampusName='").append(studentCampusName).append('\'');
        sb.append('}');
        return sb.toString();
    }
    //endregion

    //region compareStudent

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     * <p>
     * <p>The implementor must ensure <tt>sgn(x.compareTo(y)) ==
     * -sgn(y.compareTo(x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
     * implies that <tt>x.compareTo(y)</tt> must throw an exception iff
     * <tt>y.compareTo(x)</tt> throws an exception.)
     * <p>
     * <p>The implementor must also ensure that the relation is transitive:
     * <tt>(x.compareTo(y)&gt;0 &amp;&amp; y.compareTo(z)&gt;0)</tt> implies
     * <tt>x.compareTo(z)&gt;0</tt>.
     * <p>
     * <p>Finally, the implementor must ensure that <tt>x.compareTo(y)==0</tt>
     * implies that <tt>sgn(x.compareTo(z)) == sgn(y.compareTo(z))</tt>, for
     * all <tt>z</tt>.
     * <p>
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * <tt>(x.compareTo(y)==0) == (x.equals(y))</tt>.  Generally speaking, any
     * class that implements the <tt>Comparable</tt> interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     * <p>
     * <p>In the foregoing description, the notation
     * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
     * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
     * <tt>0</tt>, or <tt>1</tt> according to whether the value of
     * <i>expression</i> is negative, zero or positive.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(StudentCampus o)
    {
        Long compareL = 50l;

        if (o.getId() < compareL)
        {
            return 1;
        }

        return 0;
    }

    /**
     * Compares its two arguments for order.  Returns a negative integer,
     * zero, or a positive integer as the first argument is less than, equal
     * to, or greater than the second.<p>
     * <p>
     * In the foregoing description, the notation
     * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
     * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
     * <tt>0</tt>, or <tt>1</tt> according to whether the value of
     * <i>expression</i> is negative, zero or positive.<p>
     * <p>
     * The implementor must ensure that <tt>sgn(compare(x, y)) ==
     * -sgn(compare(y, x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
     * implies that <tt>compare(x, y)</tt> must throw an exception if and only
     * if <tt>compare(y, x)</tt> throws an exception.)<p>
     * <p>
     * The implementor must also ensure that the relation is transitive:
     * <tt>((compare(x, y)&gt;0) &amp;&amp; (compare(y, z)&gt;0))</tt> implies
     * <tt>compare(x, z)&gt;0</tt>.<p>
     * <p>
     * Finally, the implementor must ensure that <tt>compare(x, y)==0</tt>
     * implies that <tt>sgn(compare(x, z))==sgn(compare(y, z))</tt> for all
     * <tt>z</tt>.<p>
     * <p>
     * It is generally the case, but <i>not</i> strictly required that
     * <tt>(compare(x, y)==0) == (x.equals(y))</tt>.  Generally speaking,
     * any comparator that violates this condition should clearly indicate
     * this fact.  The recommended language is "Note: this comparator
     * imposes orderings that are inconsistent with equals."
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return a negative integer, zero, or a positive integer as the
     * first argument is less than, equal to, or greater than the
     * second.
     * @throws NullPointerException if an argument is null and this
     *                              comparator does not permit null arguments
     * @throws ClassCastException   if the arguments' types prevent them from
     *                              being compared by this comparator.
     */
    @Override
    public int compare(StudentCampus o1, StudentCampus o2)
    {
        //compare id1 and id2(if id1 > id2 then is famous school)
        if (o1.getId() < o2.getId())
        {
            return 1;
        }

        return 0;
    }

    //endregion

    //region treeSet
    private Set<Student> studentSet = new TreeSet<>();

    public Set<Student> getStudentSet()
    {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet)
    {
        this.studentSet = studentSet;
    }
    //endregion
}