package com.project.quiz.app.dao;
import com.project.quiz.app.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

    List<Question> findByCategory(String category);

    @Query(value = "SELECT * FROM question q Where q.category=:category ORDER BY RANDOM() LIMIT :numQuestions",
            nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(String category, int numQuestions);
//    void deleteByCategory(String category);
}
