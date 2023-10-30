/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// Function to open the modal
function openModal(id, nom, prenom, ville, dateNaissance) {
    document.getElementById("editModal").style.display = "block";
    document.getElementById("editId").value = id;
    document.getElementById("editNom").value = nom;
    document.getElementById("editPrenom").value = prenom;
    document.getElementById("editVille").value = ville;
    document.getElementById("editDateNaissance").value = dateNaissance;
}

// Function to close the modal
function closeModal() {
    document.getElementById("editModal").style.display = "none";
}
function confirmDel(id,name,type) {
    var confirmation = confirm("Are you sure you want to delete "+name+"?");
    if (confirmation) {
        window.location.href = type+"Controller?op=delete&id=" + id;
    }
}
