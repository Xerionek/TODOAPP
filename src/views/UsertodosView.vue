<template>
  <div id="blur" :class="{ 'Display': isActive }">
      <section>
          <button id="Cancel" @click="toggleToDoDialog" >X</button>
          <input type="text" id="Title" v-model="Title" placeholder="Tytuł">
          <textarea name="Desc" id="Desc" cols="30" rows="10" placeholder="Opis" v-model="Desc"></textarea>
          <label for="Deadline">Deadline</label>
          <input type="date" name="Deadline" id="Deadline" v-model="Deadline">
          <button id="Add" @click="addToDo(); checkTodos()">Dodaj</button>
      </section>
  </div>
  <nav>
      <router-link to="/">
          <button id="Logout">Wyloguj</button>
      </router-link>
  </nav>
  <main @load="checkTodos">
      <p> {{ deadlineWarn }}</p>
      <table id="UserToDos">
          <tr>
              <th>Status</th>
              <th>Tytuł</th>
              <th>Opis</th>
              <th>Data Dodania</th>
              <th>Data Do wykonania</th>
          </tr>
          <tr v-for="(todo, index) in todos" :key="index">
          <td> 
              <select>
                  <option>Do zrobienia</option>
                  <option>Wykonane</option>
              </select>
          </td>
          <td>{{ todo.Title }}</td>
          <td>{{ todo.Desc }}</td>
          <td>{{ todo.DateAdded }}</td>
          <td>{{ todo.Deadline }}</td>
          <td><button class="DelButton" @click="dellToDo(index)"></button></td>
      </tr>
      </table>
      <p id="Placeholder">Tutaj będą twoje cele...</p>
      <button id="AddToDo" @click="toggleToDoDialog">Dodaj cel</button>
  </main>
</template>

<script lang="js">
export default {
data() {
  return {
    isActive: true,
    Title: '',
    Desc: '',
    Deadline: '',
    todos: [], 
    color: 'orange',
    deadlineWarn: ''
  };
},
methods: {
  toggleToDoDialog() {
    this.isActive = !this.isActive;
  },
  addToDo() {
    if (this.Title && this.Desc && this.Deadline) {
      const newTodo = {
        Status: 0,
        Title: this.Title,
        Desc: this.Desc,
        DateAdded: new Date().toLocaleDateString(),
        Deadline: this.Deadline,
      };

      this.todos.push(newTodo);

      this.Title = '';
      this.Desc = '';
      this.Deadline = '';

      this.$emit('childToParent', this.todos)
      this.toggleToDoDialog();
    } else {
      console.error('Please fill in all fields');
    }
  },
  checkTodos () {
    for(let i = 0; i < this.todos.length; i++) {
      // if (this.todos[i].DateAdded < this.todos[i].Deadline) {
      //   this.deadlineWarn = "Masz zaległe zadania!"
      // }
    }
  },
  dellToDo(nroftodo) {
    this.todos.splice(nroftodo, 1);
  }
}
}
</script>

<style src="../viewstyles/Main.css">
</style>