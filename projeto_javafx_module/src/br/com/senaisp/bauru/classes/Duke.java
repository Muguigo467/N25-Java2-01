package br.com.senaisp.bauru.classes;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;

public class Duke extends Group {
	private Image dukeImage;
	private Image luvaImage;
	private AudioClip som;
	//Images Views
	private ImageView dukeImgVW;
	private ImageView luvaImgVW;
	//COnstructor
	public Duke() {
		//Carrando Imagens
		dukeImage = new Image(getClass().getResource("Images/Duke.png").toString());
		luvaImage = new Image(getClass().getResource("Images/Glove.png").toString());
		//Carregando o som
		som = new AudioClip(getClass().getResource("Audios/Note5.wav").toString());
		//Dimensionando e posicionando os itens
		dukeImgVW.setFitWidth(50);
		dukeImgVW.setPreserveRatio(true); //Manter proporção da imagem
		dukeImgVW.setY(10);
		//Luva
		luvaImgVW.setFitWidth(40);
		luvaImgVW.setPreserveRatio(true);
		luvaImgVW.setX(17);
		//Adicionando os itens no group
		getChildren().addAll(dukeImgVW,luvaImgVW);
		//Criando os eventos para o duke
		criacaoEventos();
		
	}
	private void criacaoEventos() {
		setOnMouseClicked((me)->{ som.play(); } );
		//Metodo para arrastar e soltar
		setOnMouseDragged((me)->{
			double largura = 0;//this.getBoundsInLocal().getWidth() / 2;
			double altura = 0;//0this.getBoundsInLocal().getHeight() / 2;
			//posicionando o personagem na cena
			setLayoutX(me.getSceneX()-largura);
			setLayoutY(me.getSceneY()-altura);
		});
		
	}
	
}
