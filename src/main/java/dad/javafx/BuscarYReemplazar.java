package dad.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYReemplazar extends Application {

	private Label buscarLabel, reemplazarLabel;
	private TextField buscarText, reemplazarText;
	private Button buscarButton, reemplazarButton, reemplazarTodoButton, cerrarButton, ayudaButton;
	private CheckBox mayusculasCheck, buscarAtrasCheck, expresionRegularCheck, resaltarCheck;

	@Override
	public void start(Stage primaryStage) throws Exception {

		buscarLabel = new Label("Buscar:");
		reemplazarLabel = new Label("Reemplazar con:");

		buscarText = new TextField();
		reemplazarText = new TextField();

		buscarButton = new Button("Buscar");
		buscarButton.setMaxWidth(Double.MAX_VALUE);
		buscarButton.setDefaultButton(true);

		reemplazarButton = new Button("Reemplazar");
		reemplazarButton.setMaxWidth(Double.MAX_VALUE);
		reemplazarTodoButton = new Button("Reemplazar todo");
		reemplazarTodoButton.setMaxWidth(Double.MAX_VALUE);
		cerrarButton = new Button("Cerrar");
		cerrarButton.setMaxWidth(Double.MAX_VALUE);
		ayudaButton = new Button("Ayuda");
		ayudaButton.setMaxWidth(Double.MAX_VALUE);

		mayusculasCheck = new CheckBox("Mayúsculas y minúsculas");
		buscarAtrasCheck = new CheckBox("Buscar hacia atrás");
		expresionRegularCheck = new CheckBox("Expresión regular");
		resaltarCheck = new CheckBox("Resaltar resultados");

		GridPane buscarGrid = new GridPane();
		buscarGrid.addRow(0, buscarLabel, buscarText);
		buscarGrid.addRow(1, reemplazarLabel, reemplazarText);

		GridPane checkGrid = new GridPane();
		checkGrid.addRow(0, mayusculasCheck, buscarAtrasCheck);
		checkGrid.addRow(1, expresionRegularCheck, resaltarCheck);
		checkGrid.setHgap(5);
		checkGrid.setVgap(5);

		buscarGrid.setHgap(5);
		buscarGrid.setVgap(5);

		buscarGrid.add(checkGrid, 1, 2);

		ColumnConstraints[] cols = {

				new ColumnConstraints(), new ColumnConstraints() };

		cols[1].setFillWidth(true);
		cols[1].setHgrow(Priority.ALWAYS);
		buscarGrid.getColumnConstraints().addAll(cols);

		VBox btBox = new VBox(5, buscarButton, reemplazarButton, reemplazarTodoButton, cerrarButton, ayudaButton);

		BorderPane root = new BorderPane();
		root.setCenter(buscarGrid);
		root.setRight(btBox);
		root.setPadding(new Insets(5, 5, 5, 5));
		BorderPane.setMargin(buscarGrid, new Insets(0, 15, 0, 0));
		BorderPane.setAlignment(btBox, Pos.CENTER);

		Scene scene = new Scene(root, 600, 200);

		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
