package com.workfit.backend.repository;

import com.workfit.backend.enums.MuscleGroup;
import com.workfit.backend.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

    Optional<Exercise> findByName(String name);

    List<Exercise> findAllByMuscleGroup(MuscleGroup muscleGroup);
}