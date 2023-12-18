<template>
    <form action="">
        <input type="text" placeholder="Login" id="Login">
        <input type="password" placeholder="Hasło" id="Password">
        <div class="temp">
            <button id="RegisterBtn">Zarejsetruj się</button>
            <router-link to="/user">
              <button id="LoginBtn">Zaloguj się</button>
            </router-link>

        </div>
    </form>
</template>

<script lang="ts">

export default {
    
}
</script>

<style src="../viewstyles/Login.css">
</style>

<style src="../viewstyles/Main.css">
</style>
