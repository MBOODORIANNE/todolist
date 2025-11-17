package com.example.todolist.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity                     // Cette classe représente une table en base de données
@Table(name = "tasks")      // Nom physique de la table
@Data                       // Génère getters/setters automatiquement
@NoArgsConstructoret si je veux ajouter cette modification sur git comment je fais je fais dabord git add et ensuite le commit et le pushet si je veux ajouter cette modification sur git comment je fais je fais dabord git add et ensuite le commit et le push
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;        // Identifiant unique de la tâche

    @Column(nullable = false)
    private String title;   // Titre de la tâche

    private String description;  // Description optionnelle

    private boolean completed = false;  // État de la tâche (terminée ou non)
}
