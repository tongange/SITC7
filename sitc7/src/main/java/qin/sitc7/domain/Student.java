package qin.sitc7.domain;

import qin.javaee7.core.hibernate.SuperEntity7;
import qin.sitc7.core.SitcPrint;

import java.util.Date;

@SuppressWarnings("all")
public class Student implements SuperEntity7<Integer>
{
    //region constructor
    public Student()
    {
        SitcPrint.print7.prints("ini Student class");
    }

    public Student(Integer studentId, String studentName, String studentEnglishName, String studentGrade, String studentFaculty, StudentMajor studentMajor, String studentMajorDirection, StudentRecord studentRecord, StudentCampus studentCampus, String studentLengthOfSchooling, boolean studentIsInSchool, boolean studentIsInNation, Integer studentNoId, String studentClass, String studentHistoryClass, Date studentInSchoolTime, Date studentGradeSchoolTime, String studentOldUsingName,
                   String studentNation, StudentPoliticalStatus studentPoliticalStatus, Date studentBirthDate, Long studentIdCard, StudentNativePlace studentNativePlace, String studentIsMarried, StudentGender studentGender, String studentEmail, String studentAddress, Long studentAddressTelephone, String studentZipCode)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEnglishName = studentEnglishName;
        this.studentGrade = studentGrade;
        this.studentFaculty = studentFaculty;
        this.studentMajor = studentMajor;
        this.studentMajorDirection = studentMajorDirection;
        this.studentRecord = studentRecord;
        this.studentCampus = studentCampus;
        this.studentLengthOfSchooling = studentLengthOfSchooling;
        this.studentIsInSchool = studentIsInSchool;
        this.studentIsInNation = studentIsInNation;
        this.studentNoId = studentNoId;
        this.studentClass = studentClass;
        this.studentHistoryClass = studentHistoryClass;
        this.studentInSchoolTime = studentInSchoolTime;
        this.studentGradeSchoolTime = studentGradeSchoolTime;
        this.studentOldUsingName = studentOldUsingName;
        this.studentNation = studentNation;
        this.studentPoliticalStatus = studentPoliticalStatus;
        this.studentBirthDate = studentBirthDate;
        this.studentIdCard = studentIdCard;
        this.studentNativePlace = studentNativePlace;
        this.studentIsMarried = studentIsMarried;
        this.studentGender = studentGender;
        this.studentEmail = studentEmail;
        this.studentAddress = studentAddress;
        this.studentAddressTelephone = studentAddressTelephone;
        this.studentZipCode = studentZipCode;
    }
    //endregion

    //region id
    private Integer id;

    public Integer getId()
    {
        return id;
    }

    @Override
    public void setId(Integer id)
    {
        this.id = id;
    }
    //endregion

    //region studentId
    private Integer studentId;

    public Integer getStudentId()
    {
        return studentId;
    }

    public void setStudentId(Integer studentId)
    {
        this.studentId = studentId;
    }
    //endregion

    //region studentName
    private String studentName;

    public String getStudentName()
    {
        return studentName;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }
    //endregion

    //region studentEnglishName
    private String studentEnglishName;

    public String getStudentEnglishName()
    {
        return studentEnglishName;
    }

    public void setStudentEnglishName(String studentEnglishName)
    {
        this.studentEnglishName = studentEnglishName;
    }
    //endregion

    //region studentGrade
    private String studentGrade;

    public String getStudentGrade()
    {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade)
    {
        this.studentGrade = studentGrade;
    }
    //endregion

    //region studentFaculty
    private String studentFaculty;

    public String getStudentFaculty()
    {
        return studentFaculty;
    }

    public void setStudentFaculty(String studentFaculty)
    {
        this.studentFaculty = studentFaculty;
    }
    //endregion

    //region StudentMajor
    private StudentMajor studentMajor;

    public StudentMajor getStudentMajor()
    {
        return studentMajor;
    }

    public void setStudentMajor(StudentMajor studentMajor)
    {
        this.studentMajor = studentMajor;
    }
    //endregion

    //region studentMajorDirection
    private String studentMajorDirection;

    public String getStudentMajorDirection()
    {
        return studentMajorDirection;
    }

    public void setStudentMajorDirection(String studentMajorDirection)
    {
        this.studentMajorDirection = studentMajorDirection;
    }
    //endregion

    //region studentRecord
    private StudentRecord studentRecord;

    public StudentRecord getStudentRecord()
    {
        return studentRecord;
    }

    public void setStudentRecord(StudentRecord studentRecord)
    {
        this.studentRecord = studentRecord;
    }
    //endregion

    //region studentCampus
    private StudentCampus studentCampus;

    public StudentCampus getStudentCampus()
    {
        return studentCampus;
    }

    public void setStudentCampus(StudentCampus studentCampus)
    {
        this.studentCampus = studentCampus;
    }
    //endregion

    //region studentLengthOfSchooling
    private String studentLengthOfSchooling;

    public String getStudentLengthOfSchooling()
    {
        return studentLengthOfSchooling;
    }

    public void setStudentLengthOfSchooling(String studentLengthOfSchooling)
    {
        this.studentLengthOfSchooling = studentLengthOfSchooling;
    }
    //endregion

    //region studentIsInSchool
    private boolean studentIsInSchool;

    public boolean isStudentIsInSchool()
    {
        return studentIsInSchool;
    }

    public void setStudentIsInSchool(boolean studentIsInSchool)
    {
        this.studentIsInSchool = studentIsInSchool;
    }
    //endregion

    //region studentIsInNation
    private boolean studentIsInNation;

    public boolean isStudentIsInNation()
    {
        return studentIsInNation;
    }

    public void setStudentIsInNation(boolean studentIsInNation)
    {
        this.studentIsInNation = studentIsInNation;
    }
    //endregion

    //region studentNoId
    private Integer studentNoId;

    public Integer getStudentNoId()
    {
        return studentNoId;
    }

    public void setStudentNoId(Integer studentNoId)
    {
        this.studentNoId = studentNoId;
    }
    //endregion

    //region studentClass
    private String studentClass;

    public String getStudentClass()
    {
        return studentClass;
    }

    public void setStudentClass(String studentClass)
    {
        this.studentClass = studentClass;
    }
    //endregion

    //region studentHistoryClass
    private String studentHistoryClass;

    public String getStudentHistoryClass()
    {
        return studentHistoryClass;
    }

    public void setStudentHistoryClass(String studentHistoryClass)
    {
        this.studentHistoryClass = studentHistoryClass;
    }
    //endregion

    //region studentInSchoolTime
    private Date studentInSchoolTime;

    public Date getStudentInSchoolTime()
    {
        return studentInSchoolTime;
    }

    public void setStudentInSchoolTime(Date studentInSchoolTime)
    {
        this.studentInSchoolTime = studentInSchoolTime;
    }
    //endregion

    //region studentGradeSchoolTime
    private Date studentGradeSchoolTime;

    public Date getStudentGradeSchoolTime()
    {
        return studentGradeSchoolTime;
    }

    public void setStudentGradeSchoolTime(Date studentGradeSchoolTime)
    {
        this.studentGradeSchoolTime = studentGradeSchoolTime;
    }
    //endregion

    //region studentOldUsingName
    private String studentOldUsingName;

    public String getStudentOldUsingName()
    {
        return studentOldUsingName;
    }

    public void setStudentOldUsingName(String studentOldUsingName)
    {
        this.studentOldUsingName = studentOldUsingName;
    }
    //endregion

    //region studentNation
    private String studentNation;

    public String getStudentNation()
    {
        return studentNation;
    }

    public void setStudentNation(String studentNation)
    {
        this.studentNation = studentNation;
    }
    //endregion

    //region studentPoliticalStatus
    private StudentPoliticalStatus studentPoliticalStatus;

    public StudentPoliticalStatus getStudentPoliticalStatus()
    {
        return studentPoliticalStatus;
    }

    public void setStudentPoliticalStatus(StudentPoliticalStatus studentPoliticalStatus)
    {
        this.studentPoliticalStatus = studentPoliticalStatus;
    }
    //endregion

    //region studentBirthDate
    private Date studentBirthDate;

    public Date getStudentBirthDate()
    {
        return studentBirthDate;
    }

    public void setStudentBirthDate(Date studentBirthDate)
    {
        this.studentBirthDate = studentBirthDate;
    }
    //endregion

    //region studentIdCard
    private Long studentIdCard;

    public Long getStudentIdCard()
    {
        return studentIdCard;
    }

    public void setStudentIdCard(Long studentIdCard)
    {
        this.studentIdCard = studentIdCard;
    }
    //endregion

    //region studentNativePlace
    private StudentNativePlace studentNativePlace;

    public StudentNativePlace getStudentNativePlace()
    {
        return studentNativePlace;
    }

    public void setStudentNativePlace(StudentNativePlace studentNativePlace)
    {
        this.studentNativePlace = studentNativePlace;
    }
    //endregion

    //region studentIsMarried
    private String studentIsMarried;

    public String getStudentIsMarried()
    {
        return studentIsMarried;
    }

    public void setStudentIsMarried(String studentIsMarried)
    {
        this.studentIsMarried = studentIsMarried;
    }
    //endregion

    //region studentGender
    private StudentGender studentGender;

    public StudentGender getStudentGender()
    {
        return studentGender;
    }

    public void setStudentGender(StudentGender studentGender)
    {
        this.studentGender = studentGender;
    }
    //endregion

    //region studentEmail
    private String studentEmail;

    public String getStudentEmail()
    {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail)
    {
        this.studentEmail = studentEmail;
    }
    //endregion

    //region studentAddress
    private String studentAddress;

    public String getStudentAddress()
    {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress)
    {
        this.studentAddress = studentAddress;
    }
    //endregion

    //region studentAddressTelephone
    private Long studentAddressTelephone;

    public Long getStudentAddressTelephone()
    {
        return studentAddressTelephone;
    }

    public void setStudentAddressTelephone(Long studentAddressTelephone)
    {
        this.studentAddressTelephone = studentAddressTelephone;
    }
    //endregion

    //region studentZipCode
    private String studentZipCode;

    public String getStudentZipCode()
    {
        return studentZipCode;
    }

    public void setStudentZipCode(String studentZipCode)
    {
        this.studentZipCode = studentZipCode;
    }
    //endregion

    //region toString()

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("id=").append(id);
        sb.append(", studentId=").append(studentId);
        sb.append(", studentName='").append(studentName).append('\'');
        sb.append(", studentEnglishName='").append(studentEnglishName).append('\'');
        sb.append(", studentGrade='").append(studentGrade).append('\'');
        sb.append(", studentFaculty='").append(studentFaculty).append('\'');
        sb.append(", studentMajorDirection='").append(studentMajorDirection).append('\'');
        sb.append(", studentLengthOfSchooling='").append(studentLengthOfSchooling).append('\'');
        sb.append(", studentIsInSchool=").append(studentIsInSchool);
        sb.append(", studentIsInNation=").append(studentIsInNation);
        sb.append(", studentNoId=").append(studentNoId);
        sb.append(", studentClass='").append(studentClass).append('\'');
        sb.append(", studentHistoryClass='").append(studentHistoryClass).append('\'');
        sb.append(", studentInSchoolTime=").append(studentInSchoolTime);
        sb.append(", studentGradeSchoolTime=").append(studentGradeSchoolTime);
        sb.append(", studentOldUsingName='").append(studentOldUsingName).append('\'');
        sb.append(", studentNation='").append(studentNation).append('\'');
        sb.append(", studentBirthDate=").append(studentBirthDate);
        sb.append(", studentIdCard=").append(studentIdCard);
        sb.append(", studentIsMarried='").append(studentIsMarried).append('\'');
        sb.append(", studentEmail='").append(studentEmail).append('\'');
        sb.append(", studentAddress='").append(studentAddress).append('\'');
        sb.append(", studentAddressTelephone=").append(studentAddressTelephone);
        sb.append(", studentZipCode='").append(studentZipCode).append('\'');
        sb.append('}');
        return sb.toString();
    }

    //endregion
}


























