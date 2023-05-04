package com.appkool.kool.respository;

import com.appkool.kool.entity.Note;
import com.appkool.kool.entity.NoteDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    Note findNoteById(Long id);

    Note findByTitle(String header);
}
