<template>
    <form action="">
        <input type="text" placeholder="Login" id="Login" v-model="currLogin">
        <input type="password" placeholder="Hasło" id="Password" v-model="currPassword">
        <div class="temp">
            <button id="RegisterBtn" @click="register">Zarejestruj się</button>
            <button id="LoginBtn" @click="validateLogin">Zaloguj się</button>
        </div>
    </form>
    <p id="ErrorMsg"> {{ ErrorMesage }}</p>
</template>

<script lang="js">
import router from '@/router';
export default {
    methods: {
        // readUsers () {
        //     let UsersRaw = usersTxt.split("\r");
        //     for (let i = 0; i < UsersRaw.length; i++) {
        //         this.Users.push(UsersRaw[i].split(":"));
        //     }
        //     this.ErrorMesage = this.Users;
        // },
        register () {
            this.Users.push([this.currLogin, this.currPassword]);
            this.ErrorMesage = "Dodano użytkownika!";
            // let toFile = "";
            // for(let i = 0; i < this.Users.length; i++) {
            //     toFile += this.Users[i][0] + ":" + this.Users[i][1] + "\r"
            //     const blob = new Blob([toFile], { type: 'text/plain;charset=utf-8' });
            //     saveAs(blob, 'users.txt');
            // } 
        },
        validateLogin () {
            // if (this.currLogin == 'user1' && this.currPassword == '123') {
            //     this.$router.push('user')
            // } 
            // else {
            //     this.ErrorMesage = "Błędne dane!"
            // }
            if (this.currLogin == 'root' && this.currPassword == 'toor') {
                this.$router.push('admin')
            } 
            for (let i = 0; i < this.Users.length; i++) {
                if (this.Users[i][0] == this.currLogin && this.Users[i][1] == this.currPassword) {
                    this.$router.push('user')
                    return;
                }
            }
            this.ErrorMesage = "Błędne dane logowania"

            // UserDataService.GetUser();
        },
    },
    data () {
        return {
            currLogin: '',
            currPassword: '',
            Users: [],
            ErrorMesage: '',
        }
    },
}
</script>

<style src="../viewstyles/Login.css">
</style>

<style src="../viewstyles/Main.css">
</style>
