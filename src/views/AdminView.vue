<template>
    <nav>
        <router-link to="/">
            <button id="Logout">Wyloguj</button>
        </router-link>
    </nav>
    <main>
        <table>
            <tr>
                <th>Użytkowncy</th>
                <th colspan="2">Akcje</th>
            </tr>
            <tr v-for="(Users, index) in Users" :key="index">
                <td> {{ Users }}</td>
                <td>
                    <router-link to="/user">
                        <button class="SeeUserToDos">Zobacz cele</button>
                    </router-link>
                </td>
                <td>
                    <button class="DeleteUser" @click="deleteUser">Usuń</button>
                </td>
            </tr>
        </table>
    </main>
</template>

<script>
    export default {
        data () {
            return {
                Users: ["user", "user1"],
            }
        },
        methods: {
            deleteUser () {
                this.Users.splice(0, 1);
            }
        }
    }
</script>