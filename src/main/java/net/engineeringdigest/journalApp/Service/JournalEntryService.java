package net.engineeringdigest.journalApp.Service;
import net.engineeringdigest.journalApp.Repository.JournalEntryRepository;
import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JournalEntryService
{
    @Autowired
    private JournalEntryRepository journalEntryRepository;

    // ✅ Method to save a journal entry
    public void saveEntry(JournalEntry journalentry)
    {
         journalEntryRepository.save(journalentry);
    }

    // ✅ Method to fetch all journal entries from MongoDB
    public List<JournalEntry> getAll()
    {
        return journalEntryRepository.findAll();
    }

    // ✅ Method to fetch a journal entry by ID
    public Optional<JournalEntry> findById(ObjectId id)
    {
        return journalEntryRepository.findById(id);
    }

    // ✅ Method to delete an entry
    public void deleteById(ObjectId id)
    {
        journalEntryRepository.deleteById(id);
    }
}
