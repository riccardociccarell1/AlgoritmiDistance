const readline = require("readline");
const { spawn } = require("child_process");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

const ask = (question) => new Promise((res) => rl.question(question, res));

(async () => {
    console.log("Scegli un'opzione:");
    console.log("1. Esegui algoritmo su liste di coppie");
    console.log("2. Esegui algoritmo su liste di singoli elementi");

    const scelta = await ask("Inserisci il numero della tua scelta: ");

    if (scelta === "1") {
        const lista1coppia1 = await ask("Inserisci la prima stringa della prima coppia: ");
        const lista2coppia1 = await ask("Inserisci la seconda stringa della prima coppia: ");
        const lista1coppia2 = await ask("Inserisci la prima stringa della seconda coppia: ");
        const lista2coppia2 = await ask("Inserisci la seconda stringa della seconda coppia: ");
        const tipologiacoppie = await ask("Inserisci il numerro corrispondente alla tipologia delle coppie:\n" +
            "1: COPPIE_INTERI\n" +
            "2: COPPIE_CARATTERI\n" +
            "3: COPPIE_INTERO_CARATTERE\n" +
            "4: COPPIE_CARATTERE_INTERO\n");
        const tipologiaAlgoritmo = await ask("Inserisci il numero dell'algoritmo:\n" +
            "1: EDITDISTANCE\n" +
            "2: GLOBALDISTANCE\n" +
            "3: LOCALDISTANCE\n");
        const filename = await ask("Nome file CSV di output (senza estensione): ");
        rl.close();

        const javaProcess = spawn("java", [
            "-cp", "build/classes/java/main",
            "org.algoritmiDiConfronto.Script.MainRunnerCoppie",
            lista1coppia1,
            lista2coppia1,
            lista1coppia2,
            lista2coppia2,
            tipologiacoppie,
            tipologiaAlgoritmo,
            filename
        ]);

        javaProcess.stdout.on("data", (data) => {
            console.log(`OUTPUT: ${data}`);
        });

        javaProcess.stderr.on("data", (data) => {
            console.error(`ERRORE: ${data}`);
        });

        javaProcess.on("close", (code) => {
            if (code !== 0) {
                console.error(`Il processo Java è terminato con codice di errore: ${code}`);
            } else {
                console.log("Processo Java completato con successo.");
            }
        });

    } else if (scelta === "2") {
        const str1 = await ask("Inserisci la prima stringa: ");
        const str2 = await ask("Inserisci la seconda stringa: ");
        const tipo = await ask("Tipo numero corrispondente al tipo dell' elemento:\n" +
            "1: CHARACTER\n" +
            "2: INTEGER\n");
        const algoritmo = await ask("Inserisci il numero dell'algoritmo:\n" +
            "1: EDITDISTANCE\n" +
            "2: GLOBALDISTANCE\n" +
            "3: LOCALDISTANCE\n");
        const filename = await ask("Nome file CSV di output (senza estensione): ");
        rl.close();

        const javaProcess = spawn("java", [
            "-cp", "build/classes/java/main",
            "org.algoritmiDiConfronto.Script.MainRunner",
            str1,
            str2,
            tipo,
            algoritmo,
            filename
        ]);

        javaProcess.stdout.on("data", (data) => {
            console.log(`OUTPUT: ${data}`);
        });

        javaProcess.stderr.on("data", (data) => {
            console.error(`ERRORE: ${data}`);
        });

        javaProcess.on("close", (code) => {
            if (code !== 0) {
                console.error(`Il processo Java è terminato con codice di errore: ${code}`);
            } else {
                console.log("Processo Java completato con successo.");
            }
        });

    } else {
        console.log("Scelta non valida. Uscita.");
        rl.close();
    }
})();