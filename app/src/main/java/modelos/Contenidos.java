package modelos;

import com.example.trabajosemana3.R;

public class Contenidos {
    private Pagina[] mPaginas;

    public Contenidos() {
        mPaginas = new Pagina[9]; // Número de páginas necesarias

        // Inicio de la historia
        mPaginas[0] = new Pagina(
                R.drawable.img1,
                "Saludos joven %s, aquí empieza tu viaje. Si lo haces bien te convertirás en un gran maestro y quizás en una leyenda. Decide ahora qué deseas hacer y comienza a escribir tu destino.",
                new Opcion("Entrenar y formarme", 1),
                new Opcion("Ir a luchar ¡YA!", 5));

        // Entrenamiento de armas
        mPaginas[1] = new Pagina(
                R.drawable.img2,
                "Has decidido entrenar. Debes elegir un arma para dominar.",
                new Opcion("Elijo el Báculo", 2),
                new Opcion("Elijo la Katana", 3));

        mPaginas[2] = new Pagina(
                R.drawable.img4,
                "¡Enhorabuena! Has aprendido a usar el Báculo, ahora eres un maestro del Báculo, %s.",
                new Opcion("Ir a luchar", 4),
                new Opcion("Entrenar la Katana", 3));

        mPaginas[3] = new Pagina(
                R.drawable.img5,
                "¡Felicidades! Ahora dominas la Katana, %s.",
                new Opcion("Ir a luchar", 4),
                new Opcion("Entrenar el Báculo", 2));

        // Enfrentamiento contra Suzuki
        mPaginas[4] = new Pagina(
                R.drawable.img1,
                "Te has convertido en un maestro absoluto. Ahora estás listo para enfrentar a Suzuki.",
                new Opcion("Atacar de frente", 5),
                new Opcion("Atacar por la espalda", 6));

        // Derrota si no domina ambas armas y ataca de frente
        mPaginas[5] = new Pagina(
                R.drawable.img6,
                "Has sido derrotado... Suzuki era demasiado fuerte para ti.");


        // Decisión de arma para el ataque por la espalda
        mPaginas[6] = new Pagina(
                R.drawable.img6,
                "Tienes la oportunidad de atacar por la espalda. ¿Con qué arma atacarás?",
                new Opcion("Con el Báculo", 7),
                new Opcion("Con la Katana", 8));

        // Victoria si usa el arma que domina al atacar por la espalda
        mPaginas[7] = new Pagina(
                R.drawable.img7,
                "¡Has derrotado a Suzuki con el Báculo! Eres un guerrero estratégico e inteligente.",
                new Opcion("Jugar de nuevo", 0));

        mPaginas[8] = new Pagina(
                R.drawable.img7,
                "¡Has derrotado a Suzuki con la Katana! Eres una leyenda.",
                new Opcion("Jugar de nuevo", 0));

    }

    public Pagina getPage(int pageNumber) {
        return mPaginas[pageNumber];
    }
}



