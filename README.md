# Java Csv

## Ho usato la libreria OpenCsv per lavorare sui file Csv, e la libreria commons-io per controllare l'estensione dei file, grazie a FilenameUtils.


### Sono stati implementati i seguenti metodi:

1) read(); Per la lettura di un file CSV.
2) get(i); Per la lettura di un valore ad un determinato indice del file CSV.
3) isCsv(); Per il controllo dell'estensione di un file, cioè se il file è un CSV o meno.
4) isEmpty(); Per il controllo di un file se vuoto o meno.
5) Setter e Getter per l'oggetto file.
6) Costruttore di default vuoto e Costruttore con parametro il percorso del file.

### Scelte di programmazione

Ho scelto di usare OpenCsv invece che Apache Commons Csv per la flessibilità e la leggibilità del codice, perchè OpenCsv è implementato per il multi-threading.
Ho bocciato l'idea di usare il metodo readAll(); della libreria OpenCsv per la lettura del file, poichè questo metodo carica in memoria l'intero file per poi leggerlo, quindi nel caso di un file grande si andrebbe ad occupare in maniera considerevole la memoria. Per questo motivo ho preferito usare il metodo readNext(); della libreria OpenCsv che legge e carica 1 riga alla volta in memoria e infine nell'ArrayList, in questo modo non si va a creare una copia del file csv in memoria.

I metodi sono stati sviluppati con ArrayList poichè memorizza solo il valore dell'elemento (quindi meno memoria usata), mantiene sempre l'ordine di inserimento (che è fondamentale se si lavora con i big data di un DB).
A differenza di un HashMap possiamo avere un qualsiasi numero di elementi null nell'ArrayList, inoltre non in un HashMap non è garantito l'ordine degli elementi inseriti.

Con i metodi isCsv(), isEmpty() e al metodo isFile() dell'oggetto File, nei metodi read() e get(), saranno accettati e non si andrà in contro ad eccezioni, solo con file il cui formato è csv e che non sia vuoto.

