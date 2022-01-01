document.querySelector(".btn").addEventListener("click", () => {
    let numberOfRows = document.querySelector(".rows").value;
    let numberOfColumns = document.querySelector(".columns").value;
    let colorFirst = document.querySelector(".color_first").value;
    let colorSecond = document.querySelector(".color_second").value;
    let colorBackground = document.querySelector(".color_background").value;

    document.writeln("<style>");
    document.writeln(".td{");
    document.writeln("transition:all .4s;");
    document.writeln("}");
    document.writeln(".td:hover{");
    document.writeln("background-color:black;");
    document.writeln("color:white;");
    document.writeln("transform:scale(1.1);");
    document.writeln("border-radius:10px;");
    document.writeln("}");
    document.writeln("</style>");
    console.log("using javascript");

    console.log(numberOfRows + ", " + numberOfColumns + "," + colorFirst);
    if (colorBackground == "#000000") {
        document.writeln("<body style='width:100%;height:100vh;margin:0;padding:0;color:black;background-color:white;display:flex;flex-direction:column;justify-content:center;align-items:center;font-family: Verdana, Geneva, Tahoma, sans-serif;'>");
        document.writeln("<main style='width:100%;height:fit-content;display:flex;flex-direction:column;justify-content:center;align-items:center;'>");

        document.write("<table border='0px' style='background-color:white;width:90%;text-transform:uppercase;'>");
    } else {
        document.writeln("<body style='width:100%;height:100vh;margin:0;padding:0;color:black;background-color:" + colorBackground + ";display:flex;flex-direction:column;justify-content:center;align-items:center;font-family: Verdana, Geneva, Tahoma, sans-serif;'>");
        document.writeln("<main style='width:100%;height:fit-content;display:flex;flex-direction:column;justify-content:center;align-items:center;'>");

        document.write("<table border='0px' style='background-color:" + colorBackground + ";width:90%;text-transform:uppercase;'>");
    }

    for (let i = 0; i < numberOfRows; i++) {
        if ((i + 1) % 2 == 0) {
            if (colorFirst == "#000000") {
                document.write("<tr style='background-color:white;height:80px;text-align:center;'>");
            } else {
                document.write("<tr style='background-color:" + colorFirst + ";height:80px;text-align:center;'>");
            }
        } else {
            if (colorSecond == "#000000") {
                document.write("<tr style='background-color:#eee;height:80px;text-align:center;'>");
            } else {
                document.write("<tr style='background-color:" + colorSecond + ";height:80px;text-align:center;'>");
            }
        }
        for (let j = 0; j < numberOfColumns; j++) {
            if (i == 0 && j == 0) {
                document.write("<td style='border-radius:10px 0 0 0;' class='td'>");
            } else if (i == 0 && j == numberOfColumns - 1) {
                document.write("<td style='border-radius:0 10px 0 0;' class='td'>");

            } else if (i == numberOfRows - 1 && j == numberOfColumns - 1) {
                document.write("<td style='border-radius:0 0 10px 0;' class='td'>");

            } else if (i == numberOfRows - 1 && j == 0) {
                document.write("<td style='border-radius:0 0 0 10px;' class='td'>");
            } else {
                document.write("<td class='td'>");
            }
            document.write("row : " + (i + 1) + ", column :" + (j + 1));
            document.write("</td>");
        }
        document.write("</tr>");
    }
    document.write("</table>");
    document.writeln("</main");
    document.writeln("<body>");
});