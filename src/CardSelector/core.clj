(ns CardSelector.core
	(:gen-class))
	(import javax.swing.JFrame)
	(import javax.swing.JButton)
	(import javax.swing.JList)
	(import javax.swing.JLabel)
	(import javax.swing.JCheckBox)
	(import javax.swing.JPanel)
	(import javax.swing.DefaultComboBoxModel)
	(import javax.swing.JComboBox)
	(import java.awt.GridBagLayout)
	(import java.awt.GridBagConstraints)
	(import java.awt.Insets)
	(import java.awt.event.ActionListener)
(defn -main []
;Author Keith Wyss
;June 24 2011
;A card selector for the currently available types of dominion
	


(defn SetLabelConstraints [x y gbc]
"Sets up Grid bag for a label"
		(set! (.fill gbc) GridBagConstraints/HORIZONTAL )
		(set! (.weightx gbc) 0.5)
		(set! (.insets gbc) (Insets. 10 20 10 20))
		(set! (.gridx gbc) x)
		(set! (.gridy gbc) y)
)

(defn SetCheckConstraints [x y gbc]
"Sets up Grid bag for a checkbox"
		(set! (.fill gbc) GridBagConstraints/HORIZONTAL )
		(set! (.insets gbc) (Insets. 10 50 10 20))
		(set! (.weightx gbc) 0.5)
		(set! (.gridx gbc) x)
		(set! (.gridy gbc) y)
)
(defn SetButConstraints [y gbc]
"Sets up Grid bag for a Button"
		(set! (.fill gbc) GridBagConstraints/HORIZONTAL )
		(set! (.insets gbc) (Insets. 10 20 10 20))
		(set! (.weightx gbc) 0.5)
		(set! (.gridwidth gbc) 2)
		(set! (.gridx gbc) 0)
		(set! (.gridy gbc) y)
)
(defn CardSet []
	[
	{:Dominion true :Name "Cellar" 				   :Worth 0 :Cost [2 0] :Action 1 :Buy 0 :Draw -1 :Trash false :Attack false :React 0 	  	}
	{:Dominion true :Name "Chapel" 				   :Worth 0 :Cost [2 0] :Action 0 :Buy 0 :Draw 0 :Trash true  :Attack false	 :React 0      	}
	{:Dominion true :Name "Moat"					   :Worth 0 :Cost [2 0] :Action 0 :Buy 0 :Draw 2 :Trash false :Attack false	 :React 1      	}
	{:Dominion true :Name "Chancellor"			   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Dominion true :Name "Village"				   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Dominion true :Name "Woodcutter"			   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Dominion true :Name "Workshop"				   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Dominion true :Name "Bureaucrat"			   :Worth 0 :Cost [4 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Dominion true :Name "Feast"					   :Worth 0 :Cost [4 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Dominion true :Name "Gardens"				   :Worth 0 :Cost [4 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Dominion true :Name "Militia"				   :Worth 0 :Cost [4 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Dominion true :Name "Moneylender"			   :Worth 0 :Cost [4 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Dominion true :Name "Remodel"				   :Worth 0 :Cost [4 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Dominion true :Name "Smithy"				   :Worth 0 :Cost [4 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Dominion true :Name "Spy"					   :Worth 0 :Cost [4 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Dominion true :Name "Thief"					   :Worth 0 :Cost [4 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Dominion true :Name "Throne Room"			   :Worth 0 :Cost [4 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Dominion true :Name "Council Room"			   :Worth 0 :Cost [5 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Dominion true :Name "Festival"				   :Worth 0 :Cost [5 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Dominion true :Name "Laboratory"			   :Worth 0 :Cost [5 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Dominion true :Name "Library"				   :Worth 0 :Cost [5 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Dominion true :Name "Market"				   :Worth 0 :Cost [5 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Dominion true :Name "Mine"					   :Worth 0 :Cost [5 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Dominion true :Name "Witch"					   :Worth 0 :Cost [5 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Dominion true :Name "Adventurer"			   :Worth 0 :Cost [6 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Intrigue true :Name "Courtyard"				   :Worth 0 :Cost [2 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Intrigue true :Name "Pawn"					   :Worth 0 :Cost [2 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Intrigue true :Name "Secret Chamber"		   :Worth 0 :Cost [2 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Intrigue true :Name "Great Hall"			   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Intrigue true :Name "Masquerade"			   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}	
	{:Intrigue true :Name "Shanty Town"			   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Intrigue true :Name "Steward"				   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Intrigue true :Name "Swindler"				   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Intrigue true :Name "Wishing Well"			   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Intrigue true :Name "Baron"					   :Worth 0 :Cost [4 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Intrigue true :Name "Bridge"				   :Worth 0 :Cost [4 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Intrigue true :Name "Conspirator"			   :Worth 0 :Cost [4 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Intrigue true :Name "Coppersmith"			   :Worth 0 :Cost [4 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Intrigue true :Name "Ironworks"				   :Worth 0 :Cost [4 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Intrigue true :Name "Mining Village"		   :Worth 0 :Cost [4 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Intrigue true :Name "Scout"					   :Worth 0 :Cost [4 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Intrigue true :Name "Duke"					   :Worth 0 :Cost [5 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Intrigue true :Name "Minion"				   :Worth 0 :Cost [5 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Intrigue true :Name "Saboteur"				   :Worth 0 :Cost [5 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Intrigue true :Name "Torturer"				   :Worth 0 :Cost [5 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Intrigue true :Name "Trading Post"			   :Worth 0 :Cost [5 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Intrigue true :Name "Tribute"				   :Worth 0 :Cost [5 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Intrigue true :Name "Upgrade"				   :Worth 0 :Cost [5 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Intrigue true :Name "Harem"					   :Worth 0 :Cost [6 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Intrigue true :Name "Nobles"				   :Worth 0 :Cost [6 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Alchemy  true :Name "Alchemist"				   :Worth 0 :Cost [3 1] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Alchemy  true :Name "Apothecary"			   :Worth 0 :Cost [2 1] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Alchemy  true :Name "Apprentice"			   :Worth 0 :Cost [5 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Alchemy  true :Name "Familiar"				   :Worth 0 :Cost [3 1] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Alchemy  true :Name "Golem"					   :Worth 0 :Cost [4 1] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Alchemy  true :Name "Herbalist"				   :Worth 0 :Cost [2 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Alchemy  true :Name "Philosophers Stone"	   :Worth 0 :Cost [3 1] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Alchemy  true :Name "Possession"			   :Worth 0 :Cost [6 1] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Alchemy  true :Name "Scrying Pool"			   :Worth 0 :Cost [2 1] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Alchemy  true :Name "Transmute"				   :Worth 0 :Cost [0 1] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Alchemy  true :Name "University"			   :Worth 0 :Cost [2 1] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Alchemy  true :Name "Vineyard"				   :Worth 0 :Cost [0 1] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Prosperity true :Name 	"Bank"				   :Worth 0 :Cost [7 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Prosperity true :Name 	"Bishop"			   :Worth 0 :Cost [4 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Prosperity true :Name 	"City"				   :Worth 0 :Cost [5 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Prosperity true :Name 	"Contraband"		   :Worth 0 :Cost [5 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Prosperity true :Name 	"Counting House"	   :Worth 0 :Cost [5 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Prosperity true :Name 	"Expand"			   :Worth 0 :Cost [7 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Prosperity true :Name 	"Forge"				   :Worth 0 :Cost [7 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Prosperity true :Name 	"Goons"				   :Worth 0 :Cost [6 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Prosperity true :Name 	"Grand Market"		   :Worth 0 :Cost [6 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Prosperity true :Name 	"Monument"			   :Worth 2 :Cost [4 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0		}
	{:Prosperity true :Name 	"Hoard"				   :Worth 0 :Cost [6 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Prosperity true :Name 	"Kings Court"		   :Worth 0 :Cost [7 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Prosperity true :Name 	"Loan"				   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Prosperity true :Name 	"Mint"				   :Worth 0 :Cost [5 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Prosperity true :Name 	"Peddler"			   :Worth 0 :Cost [8 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Prosperity true :Name 	"Quarry"			   :Worth 0 :Cost [4 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Prosperity true :Name 	"Rabble"			   :Worth 0 :Cost [5 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Prosperity true :Name 	"Royal Seal"		   :Worth 0 :Cost [5 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Prosperity true :Name 	"Talisman"			   :Worth 0 :Cost [4 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Prosperity true :Name 	"Trade Route"		   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Prosperity true :Name 	"Vault"				   :Worth 0 :Cost [5 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Prosperity true :Name 	"Venture"			   :Worth 0 :Cost [5 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Prosperity true :Name 	"Watchtower"		   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Prosperity true :Name 	"Workers Village"	   :Worth 0 :Cost [4 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Cornucopia true :Name  	"Hamlet"			   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Cornucopia true :Name 	"Fortune Teller"	   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Cornucopia true :Name 	"Menagerie"			   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Cornucopia true :Name 	"Farming Village"	   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Cornucopia true :Name 	"Horse Traders"		   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Cornucopia true :Name 	"Remake"			   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Cornucopia true :Name 	"Tournament"		   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Cornucopia true :Name 	"Young Witch"		   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Cornucopia true :Name 	"Harvest"			   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Cornucopia true :Name 	"Horn of Plenty"	   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Cornucopia true :Name 	"Hunting Party"		   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Cornucopia true :Name 	"Jester"			   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Cornucopia true :Name 	"Fairgrounds"		   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Embargo"				   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Haven"					   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Lighthouse"			   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Native Village"		   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Pearl Diver"			   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Ambassador"			   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Fishing Village"		   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Lookout"				   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Smugglers"				   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Warehouse"				   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Caravan"				   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Cutpurse"				   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Island"				   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Navigator"				   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Pirate Ship"			   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Salvager"				   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Sea Hag"				   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Treasure Map"			   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Bazaar"				   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Explorer"				   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Ghost Ship"			   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Merchant Ship"			   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Outpost"				   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Tactician"				   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Treasury"				   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Seaside	 true :Name "Wharf"					   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Promotion	 true :Name "Black Market"			   :Worth 0 :Cost [3 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Promotion	 true :Name "Envoy"					   :Worth 0 :Cost [4 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	{:Promotion	 true :Name "Stash"					   :Worth 0 :Cost [5 0] :Action 0 :Buy 0 :Draw 0 :Trash false :Attack false	 :React 0      	}
	]
)

(defn getCardName [index possiblecards]
(first (vals (possiblecards index)))
)
(defn getCardName [possiblecard]
(first (vals possiblecard))
)

(def exclud [])
(def butmap {})

(defn sorted-vec [coll]
	(let [arr (into-array coll)]
		(java.util.Arrays/sort arr)
		(vec arr))			
)
(defn rand-int-exc [size exclude]
  (let [x (rand-int size)]
	(cond
	(= (count exclude) size) x
	(some #{x} exclude) (recur size exclude)
	:else x
	)
  )
)
(declare possiblecards)
(def combolisten 
	(proxy [ActionListener] []
	  (actionPerformed [evt]
		(let [src (. evt getSource)]
		  (let [q (. src getSelectedIndex)
				costs (butmap src)
				cops (first costs)
				pots (first (next costs))]
			(cond
			  (some #{q} exclud) nil
		      :else (def exclud (conj exclud q))
			)
			(. cops (setText (str ((-> (possiblecards q) :Cost) 0))))
			(. pots (setText (str ((-> (possiblecards q) :Cost) 1))))
		  )
		)
	  )
	)
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn Gui []

	(def frm (JFrame. "Dominion Card Selector"))
	(doto frm 
		(.setSize 400 400) (.setVisible true) (.setDefaultCloseOperation JFrame/DISPOSE_ON_CLOSE )
		(.setContentPane @(def pan (JPanel. (GridBagLayout.))))
	)
	(def c (GridBagConstraints.))
	(SetLabelConstraints 0 0 c)
	(let [lab (JLabel. "Dominion")]
	  (. frm (add lab c)))
	(SetCheckConstraints 1 0 c)
	  (def checkNorm (JCheckBox.))
	  (. frm (add checkNorm c))
	(SetLabelConstraints 0 1 c)
	(let [lab (JLabel. "Dominion: Intrigue")]
	  (. frm (add lab c)))
	(def checkIntrigue (JCheckBox.))
	(SetCheckConstraints 1 1 c)
	  (. frm (add checkIntrigue c))
	(SetLabelConstraints 0 2 c)
	(let [lab (JLabel. "Dominion: Alchemy")]
	  (. frm (add lab c)))
	(def checkAlchemy (JCheckBox.))
	(SetCheckConstraints 1 2 c)
	  (. frm (add checkAlchemy c))
	(SetLabelConstraints 0 3 c)
	(let [lab (JLabel. "Dominion: Prosperity")]
	  (. frm (add lab c)))
	(def checkProsperity (JCheckBox.))
	(SetCheckConstraints 1 3 c)
	  (. frm (add checkProsperity c))
	(SetLabelConstraints 0 4 c)
	(let [lab (JLabel. "Dominion: Seaside")]
	  (. frm (add lab c)))
	(def checkSeaside (JCheckBox.))
	(SetCheckConstraints 1 4 c)
	  (. frm (add checkSeaside c))
	(SetLabelConstraints 0 5 c)
	(let [lab (JLabel. "Dominion: Cornucopia")]
	  (. frm (add lab c)))
	(def checkCornucopia (JCheckBox.))
	(SetCheckConstraints 1 5 c)
	  (. frm (add checkCornucopia c))
	(SetLabelConstraints 0 6 c)
	(let [lab (JLabel. "Dominion: Promo Cards")]
	  (. frm (add lab c)))
	(def checkPromo (JCheckBox.))
	(SetCheckConstraints 1 6 c)
	  (. frm (add checkPromo c))
	(def btn (JButton. "Pick your cards."))


	(SetButConstraints 7 c)
	(. frm (add btn c))
	(. frm pack)

	(.addActionListener btn
   	  (proxy [ActionListener] []
        (actionPerformed [evt]
		  (def conset #{})		
		  (if (. checkNorm isSelected) (def conset (conj conset :Dominion)) false)
		  (if (. checkIntrigue isSelected) (def conset (conj conset :Intrigue)) false)
		  (if (. checkAlchemy isSelected) (def conset (conj conset :Alchemy)) false)
		  (if (. checkProsperity isSelected) (def conset (conj conset :Prosperity)) false)
		  (if (. checkSeaside isSelected) (def conset (conj conset :Seaside)) false)
		  (if (. checkCornucopia isSelected) (def conset (conj conset :Cornucopia)) false)
		  (if (. checkPromo isSelected) (def conset (conj conset :Promotion)) false)

		  (if (or (empty? conset)(= #{:Promotion} conset))
		     (. javax.swing.JOptionPane (showMessageDialog nil "You must select at least one full card set." "Not enough cards to choose from" javax.swing.JOptionPane/DEFAULT_OPTION))
		     (do 
				(. frm (setContentPane @(def pan2 (JPanel. (GridBagLayout.)))))
				(. frm setSize 500 500)
				(def possiblecards (vec (sort-by :Name (filter #(some % conset) (CardSet))))) 
				(def cardNames (map #(% :Name) possiblecards))
				
				
				;Listener for shuffling a card selector with a button
				(def shufflelisten (proxy [ActionListener] []
				 	(actionPerformed [evt]
					  (let [src (. evt getSource) y (rand-int-exc (count cardNames) exclud)]
						      (cond (= (count exclud) (count cardNames)) nil 
								:else (def exclud (into exclud [y])))
							 (let [jcomb (first (butmap src))
									jlabs (butmap jcomb)
									cops (first jlabs)
									pots (first (next jlabs))] 
								(. jcomb (setSelectedIndex y))
								(. cops (setText (str ((-> (possiblecards y) :Cost) 0))))
								(. pots (setText (str ((-> (possiblecards y) :Cost) 1))))
							)
					  )		  
					)
				))
				(def inuse [])
				(loop [x 10]
					(if (pos? x)
					(do (def inuse (conj inuse (rand-int-exc (count cardNames) inuse)))
					(recur (dec x)))
					nil)
				)
				(def inuse (vec (sort-by #((:Cost (possiblecards %)) 0) inuse)))
				(def exclud inuse)
				(. frm (setSize 400 400))
				(def c (GridBagConstraints.))
				(print (file-seq (java.io.File. ".")))
				(let [ 
					thr (Thread/currentThread)
					ldr (.getContextClassLoader thr)
					coin (javax.imageio.ImageIO/read  
							(.getResourceAsStream ldr "images/Coin.png")) 
					   potion (javax.imageio.ImageIO/read
					(.getResourceAsStream ldr "images/Potion.png")) 
							]
				(loop [num 0 size 10]
				   (if (= size num)
					  nil
					  (do
						 (set! (. c gridx) 4)
						 (set! (. c gridy) num)
						 (cond 
							(= num 0) (set! (. c insets) (Insets. 20 20 0 20))
							(= num (dec size)) (set! (. c insets) (Insets. 0 20 20 20))
							:else	(set! (. c insets) (Insets. 0 20 0 20))
						 )
						 (let [mdl (DefaultComboBoxModel.), Jcomb (JComboBox. mdl), 
									y (inuse num) 
									shufbut (JButton. "Shuffle")
								coppers
									(JLabel. (str ((:Cost (possiblecards (inuse num))) 0)))

								potions
									(JLabel. (str ((:Cost (possiblecards (inuse num))) 1)))

								coinlabel (JLabel. (javax.swing.ImageIcon. coin)) 
								potionlabel (JLabel. (javax.swing.ImageIcon. potion))
									]
						 (doseq [x cardNames] (. mdl (addElement x)))
							(. Jcomb (setSelectedIndex y))

						 (. Jcomb (addActionListener combolisten))
						 (. pan2 (add Jcomb c))
						 (set! (. c gridx) 5)
						 (set! (. c gridy) num)
						 (def butmap (conj butmap [shufbut [Jcomb]]))
							(def butmap (conj butmap [Jcomb [coppers potions]]))
					 	 (.addActionListener shufbut shufflelisten)
					    (. pan2 (add shufbut c))
						 (cond 
							(= num 0) (set! (. c insets) (Insets. 20 10 0 2))
							(= num (dec size)) (set! (. c insets) (Insets. 0 10 20 2))
							:else	(set! (. c insets) (Insets. 0 10 0 2))
						 )
						(set! (. c gridx) 0)
						(.add pan2 coppers c)
						 (cond 
							(= num 0) (set! (. c insets) (Insets. 20 2 0 2))
							(= num (dec size)) (set! (. c insets) (Insets. 0 2 20 2))
							:else	(set! (. c insets) (Insets. 0 2 0 2))
						 )						(set! (. c gridx) 1)
						(. pan2 (add coinlabel c))
						(set! (. c gridx) 2)
						(.add pan2 potions c)
						(set! (. c gridx) 3)
						(. pan2 (add potionlabel c))
						);end let		
					  (recur (inc num) size)
					);end do
				  );end if
			    );end loop
				);end let
				(. frm pack)
				(. frm setVisible true)
			  ) ; end do
		    ) ; end if   	
	   )
	  )
	)

)

(Gui)
); end imports and defns