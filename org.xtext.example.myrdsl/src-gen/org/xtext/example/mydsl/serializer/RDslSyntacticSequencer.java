package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.RDslGrammarAccess;

@SuppressWarnings("all")
public class RDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Dataset___QueryKeyword_3_3_0_LeftCurlyBracketKeyword_3_3_1_RightCurlyBracketKeyword_3_3_3__a;
	protected AbstractElementAlias match_Dataset___RightCurlyBracketKeyword_3_3_3_QueryKeyword_3_3_0_LeftCurlyBracketKeyword_3_3_1__a;
	protected AbstractElementAlias match_Dataset___RightCurlyBracketKeyword_3_3_3_QueryKeyword_3_3_0_LeftCurlyBracketKeyword_3_3_1__p;
	protected AbstractElementAlias match_DynamicParameterValue_DefaultKeyword_3_0_0_a;
	protected AbstractElementAlias match_DynamicParameterValue_DefaultKeyword_3_0_0_p;
	protected AbstractElementAlias match_Legend___DirectionKeyword_2_q___ShowValueKeyword_3_0_q_RightCurlyBracketKeyword_3_1__q__p;
	protected AbstractElementAlias match_List___DetailKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q;
	protected AbstractElementAlias match_List___FooterKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q;
	protected AbstractElementAlias match_List___HeaderKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RDslGrammarAccess) access;
		match_Dataset___QueryKeyword_3_3_0_LeftCurlyBracketKeyword_3_3_1_RightCurlyBracketKeyword_3_3_3__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getDatasetAccess().getQueryKeyword_3_3_0()), new TokenAlias(false, false, grammarAccess.getDatasetAccess().getLeftCurlyBracketKeyword_3_3_1()), new TokenAlias(false, false, grammarAccess.getDatasetAccess().getRightCurlyBracketKeyword_3_3_3()));
		match_Dataset___RightCurlyBracketKeyword_3_3_3_QueryKeyword_3_3_0_LeftCurlyBracketKeyword_3_3_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getDatasetAccess().getRightCurlyBracketKeyword_3_3_3()), new TokenAlias(false, false, grammarAccess.getDatasetAccess().getQueryKeyword_3_3_0()), new TokenAlias(false, false, grammarAccess.getDatasetAccess().getLeftCurlyBracketKeyword_3_3_1()));
		match_Dataset___RightCurlyBracketKeyword_3_3_3_QueryKeyword_3_3_0_LeftCurlyBracketKeyword_3_3_1__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getDatasetAccess().getRightCurlyBracketKeyword_3_3_3()), new TokenAlias(false, false, grammarAccess.getDatasetAccess().getQueryKeyword_3_3_0()), new TokenAlias(false, false, grammarAccess.getDatasetAccess().getLeftCurlyBracketKeyword_3_3_1()));
		match_DynamicParameterValue_DefaultKeyword_3_0_0_a = new TokenAlias(true, true, grammarAccess.getDynamicParameterValueAccess().getDefaultKeyword_3_0_0());
		match_DynamicParameterValue_DefaultKeyword_3_0_0_p = new TokenAlias(true, false, grammarAccess.getDynamicParameterValueAccess().getDefaultKeyword_3_0_0());
		match_Legend___DirectionKeyword_2_q___ShowValueKeyword_3_0_q_RightCurlyBracketKeyword_3_1__q__p = new GroupAlias(true, false, new TokenAlias(false, true, grammarAccess.getLegendAccess().getDirectionKeyword_2()), new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getLegendAccess().getShowValueKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getLegendAccess().getRightCurlyBracketKeyword_3_1())));
		match_List___DetailKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getListAccess().getDetailKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getListAccess().getLeftCurlyBracketKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getListAccess().getRightCurlyBracketKeyword_5_3()));
		match_List___FooterKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getListAccess().getFooterKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getListAccess().getLeftCurlyBracketKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getListAccess().getRightCurlyBracketKeyword_6_3()));
		match_List___HeaderKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getListAccess().getHeaderKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getListAccess().getLeftCurlyBracketKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getListAccess().getRightCurlyBracketKeyword_4_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Dataset___QueryKeyword_3_3_0_LeftCurlyBracketKeyword_3_3_1_RightCurlyBracketKeyword_3_3_3__a.equals(syntax))
				emit_Dataset___QueryKeyword_3_3_0_LeftCurlyBracketKeyword_3_3_1_RightCurlyBracketKeyword_3_3_3__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Dataset___RightCurlyBracketKeyword_3_3_3_QueryKeyword_3_3_0_LeftCurlyBracketKeyword_3_3_1__a.equals(syntax))
				emit_Dataset___RightCurlyBracketKeyword_3_3_3_QueryKeyword_3_3_0_LeftCurlyBracketKeyword_3_3_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Dataset___RightCurlyBracketKeyword_3_3_3_QueryKeyword_3_3_0_LeftCurlyBracketKeyword_3_3_1__p.equals(syntax))
				emit_Dataset___RightCurlyBracketKeyword_3_3_3_QueryKeyword_3_3_0_LeftCurlyBracketKeyword_3_3_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DynamicParameterValue_DefaultKeyword_3_0_0_a.equals(syntax))
				emit_DynamicParameterValue_DefaultKeyword_3_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DynamicParameterValue_DefaultKeyword_3_0_0_p.equals(syntax))
				emit_DynamicParameterValue_DefaultKeyword_3_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Legend___DirectionKeyword_2_q___ShowValueKeyword_3_0_q_RightCurlyBracketKeyword_3_1__q__p.equals(syntax))
				emit_Legend___DirectionKeyword_2_q___ShowValueKeyword_3_0_q_RightCurlyBracketKeyword_3_1__q__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_List___DetailKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q.equals(syntax))
				emit_List___DetailKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_List___FooterKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q.equals(syntax))
				emit_List___FooterKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_List___HeaderKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q.equals(syntax))
				emit_List___HeaderKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('query' '{' '}')*
	 */
	protected void emit_Dataset___QueryKeyword_3_3_0_LeftCurlyBracketKeyword_3_3_1_RightCurlyBracketKeyword_3_3_3__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'query' '{')*
	 */
	protected void emit_Dataset___RightCurlyBracketKeyword_3_3_3_QueryKeyword_3_3_0_LeftCurlyBracketKeyword_3_3_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'query' '{')+
	 */
	protected void emit_Dataset___RightCurlyBracketKeyword_3_3_3_QueryKeyword_3_3_0_LeftCurlyBracketKeyword_3_3_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'default'*
	 */
	protected void emit_DynamicParameterValue_DefaultKeyword_3_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'default'+
	 */
	protected void emit_DynamicParameterValue_DefaultKeyword_3_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('direction'? ('show value'? '}')?)+
	 */
	protected void emit_Legend___DirectionKeyword_2_q___ShowValueKeyword_3_0_q_RightCurlyBracketKeyword_3_1__q__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('detail' '{' '}')?
	 */
	protected void emit_List___DetailKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('footer' '{' '}')?
	 */
	protected void emit_List___FooterKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('header' '{' '}')?
	 */
	protected void emit_List___HeaderKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
