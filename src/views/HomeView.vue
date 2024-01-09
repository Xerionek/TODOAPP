<template>
    <main>
        <h1>{{ WelcomeText }}</h1>
        <p>Strona główna twojej aplikacji  <em class="red">To</em><em class="green">Do</em>, <br> dodawaj zadania, <br> wyznaczaj cele, <br> organizuj swój czas, <br> nie zapominaj już więcej o swoich zadaniach!</p>
        <router-link to="/Login">
            <button class="Btn">Zaczynamy!</button>
        </router-link>
    </main>
</template>

<script>
    import { onMounted } from 'vue';
    export default {
        data () {
            return {
                WelcomeText: "",
            }
        },
        methods: {
            loadWelcome () {
                let text = "Witaj!";
                let textTab = [...text];
                let TempText = [];
                let i = 0;
                let STempText = '';
                setInterval(() => {
                        let toFind = text.charCodeAt(i);
                        let letter = Math.floor(
                            Math.random() * (toFind + 1 - (toFind - 3)) + (toFind - 3)
                        );
                        let ASCIILetter = String.fromCharCode(letter);
                        TempText[i] = ASCIILetter;
                        STempText = TempText.toString();
                        STempText = STempText.replaceAll(',', '');
                        
                        this.WelcomeText = STempText;
                        if (TempText[i] == textTab[i]) {
                            i++;
                            if (i == textTab.length) {
                                clearInterval();
                            }
                        } else {
                            TempText[i] = '';
                        }
                    }, 70);
            },
        },
        created () {
            this.loadWelcome();
        }
}
</script>

<style src="../viewstyles/Main.css">
</style>

<style src="../viewstyles/Home.css">
</style>