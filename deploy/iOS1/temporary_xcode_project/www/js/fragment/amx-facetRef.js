(function(){var a=adf.mf.api.amx.TypeHandler.register(adf.mf.api.amx.AmxTag.NAMESPACE_AMX,"facetRef");a.prototype.isFlattenable=function(a){return!0};a.prototype.createChildrenNodes=function(a){var c=adf.mf.internal.amx.fragment.findFragmentAmxNode(a),d=!1;if(null!=c){var e=c.getTag(),g=a.getAttribute("facetName");if(null==e.getChildFacetTag(g))return!0;e=c.getAttribute("_facetsToBeCreated");null==e&&(e=[],c.setAttributeResolvedValue("_facetsToBeCreated",e),d=new adf.mf.internal.amx.AmxNodeUpdateArguments,
d.setAffectedAttribute(c,"_facetsToBeCreated"),adf.mf.api.amx.markNodeForUpdate(d),d=!0);e.push(a);this._addAttributeValues(a);c.getState()==adf.mf.api.amx.AmxNodeStates.ABLE_TO_RENDER&&c.setState(adf.mf.api.amx.AmxNodeStates.WAITING_ON_EL_EVALUATION)}a.setState(adf.mf.api.amx.AmxNodeStates[d?"WAITING_ON_EL_EVALUATION":"ABLE_TO_RENDER"]);return!0};a.prototype.handleNotification=function(a,c){if(c==adf.mf.api.amx.AmxNodeNotifications.PRE_REMOVAL){var d=adf.mf.internal.amx.fragment.findFragmentAmxNode(a);
null!=d&&d.getTypeHandler().__removeFacet(d,a)}};a.prototype.__getRenderedChildren=function(a){var c=adf.mf.internal.amx.fragment.findFragmentAmxNode(a),d=a.getAttribute("facetName");if(null==c||null==d)return[];a=a.getId();return c.getRenderedChildren(d,a)};a.prototype.__tagInstanceUpdated=function(a,c){var d=c.getTag();if("attribute"==d.getName()&&d.getNamespace()==adf.mf.api.amx.AmxTag.NAMESPACE_AMX)for(var e=a.getAttributeResolvedValue("_attributeData",e),d=c.getAttribute("name"),g=c.getAttribute("value"),
h=0,k=e.length;h<k;++h){var m=e[h];if(m.name==d){m.value=g;break}}};a.prototype._addAttributeValues=function(a){var c=[],d=a.__getTagInstances(adf.mf.api.amx.AmxTag.NAMESPACE_AMX,"attribute");a.setAttributeResolvedValue("_attributeData",c);a=0;for(var e=d.length;a<e;++a){var g=d[a],h=g.getAttribute("name"),g=g.getAttribute("value");c.push({name:h,value:g})}}})();