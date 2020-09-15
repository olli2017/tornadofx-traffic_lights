package com.example.view

import javafx.scene.paint.Color
import javafx.scene.shape.Circle
import javafx.scene.shape.Rectangle
import tornadofx.*

class MainView : View("Testing app") {

    override val root = hbox {
        anchorpane {

            fun createRect(centerX: Int, centerY: Int, width: Int, height: Int, color: Color): Rectangle {
                return rectangle(centerX, centerY, width, height) {
                    fill = color
                }
            }

            fun createCircle(centerX: Int, centerY: Int, radius: Int, color: Color): Circle {
                return circle(centerX, centerY, radius) {
                    fill = color
                }
            }

            createRect(200, 200, 200, 500, Color.GREY)

            createCircle(300, 300, 50, Color.RED)
            createCircle(300, 420, 50, Color.YELLOW)
            createCircle(300, 540, 50, Color.GREEN)

        }
    }

}


