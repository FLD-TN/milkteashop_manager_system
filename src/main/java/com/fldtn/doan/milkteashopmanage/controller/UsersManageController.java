package com.fldtn.doan.milkteashopmanage.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class UsersManageController {

    @FXML
    private TableView<?> userTable;

    @FXML
    private TableColumn<?, ?> nameColumn;

    @FXML
    private TableColumn<?, ?> emailColumn;

    @FXML
    private TableColumn<?, ?> roleColumn;

    @FXML
    private TableColumn<?, ?> statusColumn;

    @FXML
    private TextField searchField;

    @FXML
    private Button addUserButton;

    @FXML
    private Button editUserButton;

    @FXML
    private Button deleteUserButton;

    @FXML
    public void initialize() {
        // Initialization logic here
    }

    @FXML
    private void handleAddUser() {
        // Logic for adding a user
    }

    @FXML
    private void handleEditUser() {
        // Logic for editing a user
    }

    @FXML
    private void handleDeleteUser() {
        // Logic for deleting a user
    }
}
