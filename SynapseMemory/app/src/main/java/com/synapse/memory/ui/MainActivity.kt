package com.synapse.memory.ui

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.synapse.memory.data.model.Note
import com.synapse.memory.databinding.ActivityMainBinding // Import ViewBinding class

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // Declare ViewBinding variable
    private val notesList = mutableListOf<Note>() // In-memory list for now

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // Inflate the layout
        setContentView(binding.root) // Set the content view to the binding's root

        binding.buttonSaveNote.setOnClickListener {
            val noteContent = binding.editTextNoteContent.text.toString()
            if (noteContent.isNotBlank()) {
                saveNote(noteContent)
                binding.editTextNoteContent.text.clear() // Clear the EditText
                Toast.makeText(this, "Note saved!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Note cannot be empty.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun saveNote(content: String) {
        val newNote = Note(content = content)
        notesList.add(newNote)
        // For now, just log the note. Later, this will save to database/sync.
        Log.d("MainActivity", "Note Saved: $newNote")
        Log.d("MainActivity", "Total notes: ${notesList.size}")
        // You can also print all notes to see them
        // notesList.forEach { Log.d("MainActivity", it.toString()) }
    }
}
