package com.ead.course.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "TB_MODULES")
public class ModuleModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer moduleId;

    @Column(nullable = false, length = 150)
    private String title;

    @Column(nullable = false, length = 255)
    private String description;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy HH:mm:ss")
    @Column(nullable = false)
    private LocalDateTime creationDate;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private CourseModel course;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "module", fetch = FetchType.LAZY)
    @Fetch(FetchMode.SUBSELECT)
    private Set<LessonModel> lessons;

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public CourseModel getCourse() {
        return course;
    }

    public void setCourse(CourseModel course) {
        this.course = course;
    }

    public Set<LessonModel> getLessons() {
        return lessons;
    }

    public void setLessons(Set<LessonModel> lessons) {
        this.lessons = lessons;
    }
}
