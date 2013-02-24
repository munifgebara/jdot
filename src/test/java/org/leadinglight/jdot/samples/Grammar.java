package org.leadinglight.jdot.samples;

import org.leadinglight.jdot.Edge;
import org.leadinglight.jdot.Graph;
import org.leadinglight.jdot.Node;
import org.leadinglight.jdot.Node.Shape;

public class Grammar {
	public static void main(String[] args) {
		Graph g = g();
		System.out.println(g.toDot());
		g.dot2svg();
	}

	public static Graph g() {
		Graph g = new Graph("L0").setSize("8,8")
				.setOrdering(Graph.Ordering.out);
		g.addNode(new Node().setShape(Shape.box));
		g.addNodes(new Node("n0").setLabel("E"), new Node("n1").setLabel("T"),
				new Node("n2").setLabel("F"),
				new Node("n3").setLabel("IDENT : a "),
				new Node("n4").setLabel("+"), new Node("n5").setLabel("T"),
				new Node("n6").setLabel("F"), new Node("n7").setLabel("("),
				new Node("n8").setLabel("E"), new Node("n9").setLabel("T"),
				new Node("n10").setLabel("F"),
				new Node("n11").setLabel("IDENT : b "),
				new Node("n12").setLabel("*"), new Node("n13").setLabel("F"),
				new Node("n14").setLabel("IDENT : c "),
				new Node("n15").setLabel(")"), new Node("n16").setLabel("*"),
				new Node("n17").setLabel("F"), new Node("n18").setLabel("("),
				new Node("n19").setLabel("E"), new Node("n20").setLabel("T"),
				new Node("n21").setLabel("F"),
				new Node("n22").setLabel("IDENT : d "),
				new Node("n23").setLabel("*"), new Node("n24").setLabel("F"),
				new Node("n25").setLabel("IDENT : e "),
				new Node("n26").setLabel("+"), new Node("n27").setLabel("T"),
				new Node("n28").setLabel("F"), new Node("n29").setLabel("("),
				new Node("n30").setLabel("E"), new Node("n31").setLabel("T"),
				new Node("n32").setLabel("F"),
				new Node("n33").setLabel("IDENT : a "),
				new Node("n34").setLabel("*"), new Node("n35").setLabel("F"),
				new Node("n36").setLabel("IDENT : b "),
				new Node("n37").setLabel(")"), new Node("n38").setLabel(")"),
				new Node("n39").setLabel("+"), new Node("n40").setLabel("T"),
				new Node("n41").setLabel("F"),
				new Node("n42").setLabel("IDENT : q "));
		g.addEdges(new Edge(g, "n0", "n1"), new Edge(g, "n0", "n4"), new Edge(
				g, "n0", "n5"), new Edge(g, "n0", "n39"), new Edge(g, "n0",
				"n40"), new Edge(g, "n1", "n2"), new Edge(g, "n2", "n3"),
				new Edge(g, "n5", "n6"), new Edge(g, "n5", "n16"), new Edge(g,
						"n5", "n17"), new Edge(g, "n6", "n7"), new Edge(g,
						"n6", "n8"), new Edge(g, "n6", "n15"), new Edge(g,
						"n8", "n9"), new Edge(g, "n9", "n10"), new Edge(g,
						"n9", "n12"), new Edge(g, "n9", "n13"), new Edge(g,
						"n10", "n11"), new Edge(g, "n13", "n14"), new Edge(g,
						"n17", "n18"), new Edge(g, "n17", "n19"), new Edge(g,
						"n17", "n38"), new Edge(g, "n19", "n20"), new Edge(g,
						"n19", "n26"), new Edge(g, "n19", "n27"), new Edge(g,
						"n20", "n21"), new Edge(g, "n20", "n23"), new Edge(g,
						"n20", "n24"), new Edge(g, "n21", "n22"), new Edge(g,
						"n24", "n25"), new Edge(g, "n27", "n28"), new Edge(g,
						"n28", "n29"), new Edge(g, "n28", "n30"), new Edge(g,
						"n28", "n37"), new Edge(g, "n30", "n31"), new Edge(g,
						"n31", "n32"), new Edge(g, "n31", "n34"), new Edge(g,
						"n31", "n35"), new Edge(g, "n32", "n33"), new Edge(g,
						"n35", "n36"), new Edge(g, "n40", "n41"), new Edge(g,
						"n41", "n42"));
		return g;
	}
}