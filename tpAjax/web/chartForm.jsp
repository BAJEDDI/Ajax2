<%@page import="ma.school.service.MarqueService"%>
<%@page import="ma.school.beans.Marque"%>
<%@page import="ma.school.service.MachineService"%>
<%@page import="java.util.List"%>
<%@page import="ma.school.beans.Machine"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Graphique de machines par marque</title>
        <script src="https://cdn.jsdelivr.net/npm/chart.js"> </script>
        <link href="style/css.css" rel="stylesheet" type="text/css"/>
      <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f7f7f7;
                padding: 20px;
            }
            .center-div {
        text-align: center; /* Center text horizontally within the div */
        display: flex;
        justify-content: center;
        align-items: center;
        
    }

            canvas#machineChart {
                                width: 100%; 

        margin: 2px auto; 
            }


            h1 {
                text-align: center;
                font-size: 24px;
                margin-bottom: 20px;
            }

            #chartType {
                display: block;
                margin: 20px auto;
            }
        </style>
    </head>
    <body>
        <%@include file="template/header.jsp" %>
        <%@include file="template/menu.jsp" %>
        <%@include file="template/footer.jsp" %>
        <div class="center-div">
    <div style="background-color: #fff; border: 1px solid #ddd; padding: 20px; width: 800px; height: 550px;">
        <h1 style="text-align: center;">Graphique de machines par marque</h1>
        <canvas id="machineChart"></canvas>
      
    </div>
</div>


        <%
            MachineService ms = new MachineService();
            MarqueService mrs = new MarqueService();
            List<Marque> marques = mrs.findAll();
        %>
    <script>
           
            var labels = [];
            var data = [];

            
            <%
                for (Marque marque : marques) {
            %>
        labels.push("<%= marque.getLibelle()%>"); 
        data.push(<%= ms.findByMarque(marque).size() %>); 
            <%
                }
            %>

           
            var ctx = document.getElementById('machineChart').getContext('2d');
            var machineChart = new Chart(ctx, {
                type: 'bar',
                data: {
                    labels: labels,
                    datasets: [{
                            label: 'Nombre de machines par marque',
                            data: data,
                            backgroundColor: 'rgba(75, 192, 192, 0.6)', // Couleur des barres
                            borderColor: 'rgba(75, 192, 192, 1)',
                            borderWidth: 1
                        }]
                },
                options: {
    scales: {
        y: {
            beginAtZero: true,
          
        }
    }
}

            });
        </script>
    </body>
</html>
