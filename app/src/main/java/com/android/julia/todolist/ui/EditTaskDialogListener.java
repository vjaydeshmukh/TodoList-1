package com.android.julia.todolist.ui;

// Defines the listener interface with a method passing back data result.
interface EditTaskDialogListener {
    void onFinishEditTaskDialog(int position, String description, int priority);
}
